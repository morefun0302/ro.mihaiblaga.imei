/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ro.mihaiblaga.imei;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.os.Bundle;

@Kroll.module(name = "Imei", id = "ro.mihaiblaga.imei")
public class ImeiModule extends KrollModule {

	// Standard Debugging variables
	private static final String LCAT = "ImeiModule";
	private static final boolean DBG = TiConfig.LOGD;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public ImeiModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(LCAT, "inside onAppCreate");

		// put module init code that needs to run when the application is
		// created
	}

	// Methods
	@Kroll.method
	public String getImei() {

		Context context = TiApplication.getInstance();

		TelephonyManager telephonyManager = (TelephonyManager) context
				.getSystemService(Context.TELEPHONY_SERVICE);
		
		String imei = telephonyManager.getDeviceId();
		
		return imei;
	}
}