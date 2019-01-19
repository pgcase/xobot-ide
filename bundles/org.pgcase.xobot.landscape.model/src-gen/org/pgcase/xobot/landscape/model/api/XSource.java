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
package org.pgcase.xobot.landscape.model.api;

import org.eclipse.emf.ecore.EObject;

import org.pgcase.xobot.landscape.runtime.XSourceDescriptor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XSource#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XSource#getName <em>Name</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XSource#getUri <em>Uri</em>}</li>
 *   <li>{@link org.pgcase.xobot.landscape.model.api.XSource#getSourceSet <em>Source Set</em>}</li>
 * </ul>
 *
 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getSource()
 * @model superTypes="org.pgcase.xobot.landscape.model.api.SourceDescriptor"
 * @generated
 */
public interface XSource extends EObject, XSourceDescriptor {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getSource_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XSource#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getSource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XSource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getSource_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XSource#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Source Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.pgcase.xobot.landscape.model.api.XSourceSet#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Set</em>' container reference.
	 * @see #setSourceSet(XSourceSet)
	 * @see org.pgcase.xobot.landscape.model.meta.XLandscapePackage#getSource_SourceSet()
	 * @see org.pgcase.xobot.landscape.model.api.XSourceSet#getSources
	 * @model opposite="sources" required="true" transient="false"
	 * @generated
	 */
	XSourceSet getSourceSet();

	/**
	 * Sets the value of the '{@link org.pgcase.xobot.landscape.model.api.XSource#getSourceSet <em>Source Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Set</em>' container reference.
	 * @see #getSourceSet()
	 * @generated
	 */
	void setSourceSet(XSourceSet value);

} // XSource
