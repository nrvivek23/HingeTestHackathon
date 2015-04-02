package com.hackathon.utils;

import java.awt.List;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class StringsAndObjects extends UiAutomatorTestCase {
	
/*	MY MATCHES PAGE */
	public static UiScrollable matchList = new UiScrollable(new UiSelector().scrollable(true).className("android.widget.ListView").resourceId("android:id/list"));
	

}
