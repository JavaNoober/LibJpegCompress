package com.xiaoqi.libjpegcompress;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.d1);
		try {
			ImageUtils.compress(bitmap, Environment.getExternalStorageDirectory().getCanonicalPath()+"/1.jpg");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
