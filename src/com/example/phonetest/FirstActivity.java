package com.example.phonetest;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.MenuItem;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		
		SmsManager sm = SmsManager.getDefault();
		String number = "3139306420";
		
		sm.sendTextMessage(number,  null,  "Test SMS Message", null, null);
		
		
		 
	}
}
