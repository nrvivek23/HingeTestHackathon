package com.hackathon.tests;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.hackathon.utils.Hooks;

public class MatchMe extends UiAutomatorTestCase{
	
	Hooks hooks = new Hooks();
	
	public void testLaunc() throws UiObjectNotFoundException{
		hooks.underAppsGoTo("Hinge");
	}

}
