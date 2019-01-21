/*******************************************************************************
 * Copyright (c) 2018-2019 ArSysOp
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
package org.pgcase.xobot.workspace.team.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.team.internal.ui.actions.TeamAction;

public class XobotDisconnectAction extends TeamAction {
	
	protected void execute(IAction action) {
		IProject projects[] = getSelectedProjects();
		try {
			for (int i = 0; i < projects.length; i++) {
				RepositoryProvider.unmap(projects[i]);
			}
		} catch (TeamException e) {
			ErrorDialog.openError(getShell(), "Хобот Устал", null, e.getStatus());
		} 
	}
	
	public boolean isEnabled() {
		return true;
	}
}
