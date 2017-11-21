package com.xiaoqi.libjpegcompress;

import android.app.Application;

public class MyApplication extends Application {

	public static boolean isSuppoertLibjpeg = false;

	@Override
	public void onCreate() {
		super.onCreate();
//		isSuppoertLibjpeg = ImageUtils.isSupportLibJpeg();
	}
}
