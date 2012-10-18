package com.parse.starter;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ParseStarterProjectActivity extends Activity {
	private static final String TAG = "ParseStarterProjectActivity";

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
//		try {
			Intent intent = this.getIntent();
			String action = intent.getAction();
			//intent.getExtras().containsKey("com.parse.Channel");
//			String channel = intent.getExtras().getString("com.parse.Channel");
//			JSONObject json = new JSONObject(intent.getExtras().getString("com.parse.Data"));
//
//			Log.d(TAG, "received action " + action + " on channel " + channel
//					+ " with extras:");
//			Iterator<?> itr =  json.keys();
//			while (itr.hasNext()) {
//				String key = (String) itr.next();
//				Log.d(TAG, "..." + key + " => " + json.getString(key));
//			}
//		} catch (JSONException e) {
//			Log.d(TAG, "JSONException: " + e.getMessage());
//	''	}
	}
}