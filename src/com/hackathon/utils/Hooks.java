package com.hackathon.utils;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Hooks extends UiAutomatorTestCase{
	
	public void underAppsGoTo(String iconText) throws UiObjectNotFoundException{

		UiDevice.getInstance().pressHome();

		UiObject allAppsButton = new UiObject(new UiSelector().text("Apps"));

		assertTrue("could not found Apps icon ",allAppsButton.waitForExists(10000));
		allAppsButton.clickAndWaitForNewWindow();

		UiScrollable appsView = new UiScrollable(new UiSelector().scrollable(true));
		appsView.setAsHorizontalList();
		appsView.getChildByText(new UiSelector().className("android.widget.TextView"), iconText).clickAndWaitForNewWindow();

	}
}
