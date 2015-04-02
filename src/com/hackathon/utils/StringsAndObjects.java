package com.hackathon.utils;

<<<<<<< HEAD
import java.awt.List;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class StringsAndObjects extends UiAutomatorTestCase {
	
/*	MY MATCHES PAGE */
	public static UiScrollable matchList = new UiScrollable(new UiSelector().scrollable(true).className("android.widget.ListView").resourceId("android:id/list"));
	
=======
import com.hackathon.tests.UiObject;
>>>>>>> Adding elements for Home screen and settings screen

public class StringsAndObjects {
	
	
	public static UiObject ProfileImage = new UiObject(new UiSelector().resource-id(co.hinge.mobile.android:id/image));
	
	public static UiObject ProfileText = new UiObject(new UiSelector().resource-id(co.hinge.mobile.android:id/card_desc));
			
	public static UiObject PassButton = new UiObject(new UiSelector().resrouce-id(co.hinge.mobile.android:id/button_pass));
	
	public static UiObject LikeButton = new UiObject(new UiSelector().resource-id(co.hinge.mobile.android:id/button_like));
	
	public static UiObject ProfileName = new UiObject(new UiSelector().resource-id(co.hinge.mobile.android:id/card_name));
			
	public static UiObject Settings = new UiObject(new UiSelector().class(android.widget.ImageButton).content-desc(Open navigation drawer));
	
	public static UiObject CloseSettings = new UiObject(new UiSelector().class(android.widget.ImageButton).content-desc(Close navigation drawer));
	
	public static UiObject SettingsHome = new UiObject(new UiSelector().text("Home"));
	
	public static UiObject SettingsMatch = new UiObject(new UiSelector().text("Matches"));
	
	public static UiObject SettingsProfile = new UiObject(new UiSelector().text("Profile"));
	
	public static UiObject SettingsProfile = new UiObject(new UiSelector().text("Preferences"));
	
			
}
