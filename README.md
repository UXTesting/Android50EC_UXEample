# Android50AS_UXExample
UXTesting Android Example Project
<br>


# How to use

1. Put uxtestingsdk.jar in the library folder

2. Initial your app key in Custom Application
	```java
	import io.uxtesting.UXTesting;

	public class CustomApplication extends Application {
	    @Override
	    public void onCreate() {
	        super.onCreate();
	        UXTesting.Init(this, "YOUR_APP_KEY");
	    }
	}
	```

3. Add permissions to `AndroidManifest.xml`
	```xml
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.STORAGE" />
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW"/>
    <uses-permission android:name="android.permission.WRITE_SETTINGS"/>
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-feature android:name="android.hardware.camera" android:required="false" />
    <uses-feature android:name="android.hardware.camera.autofocus" android:required="false" />
    <uses-feature android:name="android.hardware.camera.front" android:required="false" />

	```

4. Add `UXTestingService` to `AndroidManifest.xml`
	```xml
	<service android:enabled="true" android:name="io.uxtesting.UXTestingService" />
	```

5. Call this method in onActivityResult method of every Activities which will start screen record, or call in every Activities for API 23+ (6.0+) permissions processing.
	```java
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    UXTesting.onActivityResult(requestCode, resultCode, data);
	}
	```

6. Call this method in onRequestPermissionsResult method for API 23+ (6.0+) permissions processing.
	```java
	@Override
	public void onRequestPermissionsResult(int requestCode,
	                                       String permissions[], int[] grantResults)  {
	    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
	    UXTesting.onRequestPermissionsResult(requestCode, permissions, grantResults);
	}
	```

7. Run your application.

8. Shake to start your recording.

9. Shake to end your recording. 

10. Go to [UXTesting Website](http://www.uxtesting.io/apps/) to view the results with your account.

<br>


# License

THE BEER-WARE LICENSE

As long as you retain this notice you can do whatever you want with this stuff. If we meet some day, and you think this stuff is worth it, you can buy me a beer in return.