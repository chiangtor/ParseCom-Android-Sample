package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.PushService;

public class ParseApplication extends Application {
	private static final String TAG = "ParseApplication";

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
	//	Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);

		Parse.initialize(this, "OLGldRR5D157YmZ5E8mkGnL5gicu7goiTXp4sMYo", "fv7w5OvqMOvb9upoqjq1sZmhZ1KAcBwo4vjN2wZt"); 
	//	ParseUser.enableAutomaticUser();
	//	ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		//defaultACL.setPublicReadAccess(true);
		
		//ParseACL.setDefaultACL(defaultACL, true);
		
	//	ParseInstallation.createWithoutData(null, null );
		
	//When using channels, you add this activity in the subscribe method call.
		 PushService.subscribe(this, "TEST_CHANNEL_ONE", ParseStarterProjectActivity.class);
		
		//If you are using advanced targeting, you can specify a default Activity to be used
		 PushService.setDefaultPushCallback(this,  ParseStarterProjectActivity.class);

	}

}
