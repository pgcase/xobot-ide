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
package org.pgcase.xobot.workspace.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pgcase.xobot.workspace.model.api.*;

import org.pgcase.xobot.workspace.model.meta.XWorkspaceFactory;
import org.pgcase.xobot.workspace.model.meta.XWorkspacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XWorkspaceFactoryImpl extends EFactoryImpl implements XWorkspaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XWorkspaceFactory init() {
		try {
			XWorkspaceFactory theWorkspaceFactory = (XWorkspaceFactory)EPackage.Registry.INSTANCE.getEFactory(XWorkspacePackage.eNS_URI);
			if (theWorkspaceFactory != null) {
				return theWorkspaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XWorkspaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWorkspaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XWorkspacePackage.PROJECT: return createProject();
			case XWorkspacePackage.PROJECT_FOLDER: return createProjectFolder();
			case XWorkspacePackage.PROJECT_SOURCE: return createProjectSource();
			case XWorkspacePackage.PROJECT_TARGET: return createProjectTarget();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject createProject() {
		XProjectImpl project = new XProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectFolder createProjectFolder() {
		XProjectFolderImpl projectFolder = new XProjectFolderImpl();
		return projectFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectSource createProjectSource() {
		XProjectSourceImpl projectSource = new XProjectSourceImpl();
		return projectSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProjectTarget createProjectTarget() {
		XProjectTargetImpl projectTarget = new XProjectTargetImpl();
		return projectTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XWorkspacePackage getWorkspacePackage() {
		return (XWorkspacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XWorkspacePackage getPackage() {
		return XWorkspacePackage.eINSTANCE;
	}

} //XWorkspaceFactoryImpl
