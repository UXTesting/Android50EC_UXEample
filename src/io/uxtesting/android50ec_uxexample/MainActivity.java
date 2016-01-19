package io.uxtesting.android50ec_uxexample;

import io.uxtesting.UXTesting;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    UXTesting.onActivityResult(requestCode, resultCode, data);
	}
	
	@TargetApi(23)
	@Override
	public void onRequestPermissionsResult(int requestCode,
	                                       String permissions[], int[] grantResults)  {
	    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
	    UXTesting.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}
}
