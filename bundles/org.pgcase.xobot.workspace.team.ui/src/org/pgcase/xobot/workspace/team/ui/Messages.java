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

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	public static final String BUNDLE_NAME = "org.pgcase.xobot.workspace.team.ui.messages";

	public static String XobotTeamUI_CompareToTarget_Title;
	public static String XobotTeamUI_CompareToTarget_Message;

	public static String XobotConfigurationMainPage_Src;
	public static String XobotConfigurationMainPage_PathtoSrc;
	public static String XobotConfigurationMainPage_Stend_Exp;
	public static String XobotConfigurationMainPage_Stend_Itg;
	public static String XobotConfigurationMainPage_Stend_Stable;
	public static String XobotConfigurationMainPage_Stend_Production;
	public static String XobotConfigurationMainPage_Config_Stend_Exp;
	public static String XobotConfigurationMainPage_Config_Stend_Itg;
	public static String XobotConfigurationMainPage_Config_Stend_Stable;
	public static String XobotConfigurationMainPage_Config_Stend_Production;

	public static String XobotConfigurationWizard_MainPage_Name;
	public static String XobotConfigurationWizard_MainPage_Title;
	public static String XobotConfigurationWizard_MainPage_Description;

	public static String XobotConfigurationWizard_MainPage_DialogError_Title;
	public static String XobotConfigurationWizard_MainPage_DialogError_Message;
	
	public static String XobotSynchronizeWizard_PageTitle;
	//
	public static String XobotNavigatorActionProvider_Action_Delete;
	public static String XobotNavigatorActionProvider_Action_CreateFolder;
	public static String XobotNavigatorActionProvider_Action_CreateFunctionIndex;
	public static String XobotNavigatorActionProvider_Action_CreateFunctionBody;
	public static String XobotNavigatorActionProvider_Action_MakeDirty;
	
	public static String XobotNavigatorActionProvider_InputDialogFolder_Title;
	public static String XobotNavigatorActionProvider_InputDialogFolder_Description;
	public static String XobotNavigatorActionProvider_InputDialogFolder_Init;
	
	public static String XobotNavigatorActionProvider_InputDialogFuctionIndex_Title;
	public static String XobotNavigatorActionProvider_InputDialogFuctionIndex_Description;
	public static String XobotNavigatorActionProvider_InputDialogFuctionIndex_Init;
	
	public static String XobotNavigatorActionProvider_InputDialogFuctionBody_Title;
	public static String XobotNavigatorActionProvider_InputDialogFuctionBody_Description;
	public static String XobotNavigatorActionProvider_InputDialogFuctionBody_Init;
	
	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
