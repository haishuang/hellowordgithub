package com.hais.hellowordgithub;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


/**
 * A login screen that offers login via email/password and via Google+ sign in.
 * <p>
 * ************ IMPORTANT SETUP NOTES: ************
 * In order for Google+ sign in to work with your app, you must first go to:
 * https://developers.google.com/+/mobile/android/getting-started#step_1_enable_the_google_api
 * and follow the steps in "Step 1" to create an OAuth 2.0 client for your package.
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.e("yyy","fcghjkl;");
        for(int i=0;i<90;i++){
            Log.e("yyy","fcghjkl;");
        }
    }
}

