/*******************************************************************************
 * Copyright (c) 2018-2020 ArSysOp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Contributors:
 *     ArSysOp - initial API and implementation
 *******************************************************************************/
package org.pgcase.xobot.dbproc.core.resources.mappings;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.mapping.ModelProvider;
import org.eclipse.core.resources.mapping.ModelStatus;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.resources.mapping.ResourceMappingContext;
import org.eclipse.core.runtime.Adapters;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.osgi.util.NLS;
import org.pgcase.xobot.dbproc.core.resources.DbprocCoreResources;
import org.pgcase.xobot.workspace.core.resources.WorkspaceCoreResources;
import org.pgcase.xobot.workspace.runtime.XWorkspaceElementDescriptor;

public class DbprocModelProvider extends ModelProvider {
	
	public IStatus validateChange(IResourceDelta delta, IProgressMonitor monitor) {
		// Visit the changes in the delta to look for changes we care about
		final List<IStatus> problems = new ArrayList<>();
		try {
			delta.accept(new IResourceDeltaVisitor() {
				public boolean visit(IResourceDelta delta) throws CoreException {
					IResource resource = delta.getResource();
					if (DbprocCoreResources.isBodyFile(resource)) {
						// Removal may leave a stale reference in a index file
						if (delta.getKind() == IResourceDelta.REMOVED) {
							IStatus status = new ModelStatus(IStatus.ERROR, DbprocCoreResources.ID, getDescriptor().getId(), 
									NLS.bind(DBProcCoreResourcesMappingsMessages.DbprocModelProvider_message_warning_body_deleting, resource.getFullPath()));
							problems.add(status);
						}
					}
					if (DbprocCoreResources.isIndexFile(resource)) {
						// Removal may leave unreferenced body files around
						if (delta.getKind() == IResourceDelta.REMOVED) {
							IStatus status = new ModelStatus(IStatus.WARNING, DbprocCoreResources.ID, getDescriptor().getId(), 
									NLS.bind(DBProcCoreResourcesMappingsMessages.DbprocModelProvider_message_warning_index_deleting, resource.getFullPath()));
							problems.add(status);
						}
						if (delta.getKind() == IResourceDelta.ADDED 
								&& ((delta.getFlags() & IResourceDelta.COPIED_FROM) > 0)) {
							// Copying will result in two index files that reference the same body
							IStatus status = new ModelStatus(IStatus.ERROR, DbprocCoreResources.ID, getDescriptor().getId(), 
									NLS.bind(DBProcCoreResourcesMappingsMessages.DbprocModelProvider_message_warning_body_copying, delta.getMovedFromPath()));
							problems.add(status);
						}
					}
					return delta.getResource().getType() == IResource.ROOT 
						|| WorkspaceCoreResources.isXobotProject(delta.getResource().getProject());
				}
			});
		} catch (CoreException e) {
			//FIXME:
			e.printStackTrace();
		}
		if (problems.size() == 1)
			return (IStatus)problems.get(0);
		else if (problems.size() > 1) {
			return new MultiStatus(DbprocCoreResources.ID, 0, (IStatus[]) problems.toArray(new IStatus[problems.size()]), DBProcCoreResourcesMappingsMessages.DbprocModelProvider_message_warning_potential_side_effects,  null);
		}
		return super.validateChange(delta, monitor);
	}
	
	public ResourceMapping[] getMappings(IResource resource, ResourceMappingContext context, IProgressMonitor monitor) throws CoreException {
		XWorkspaceElementDescriptor element = Adapters.adapt(resource, XWorkspaceElementDescriptor.class);
		if (element != null) {
			ResourceMapping mapping = Adapters.adapt(element, ResourceMapping.class);
			return new ResourceMapping[] { mapping };
		}
		return super.getMappings(resource, context, monitor);
	}

}
