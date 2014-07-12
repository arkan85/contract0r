package com.snippetdump.contract0r.activities;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.snippetdump.contract0r.controller.DatabaseController;

public class MainActivity extends Activity {
	
	private final String LOG_TAG = getClass().getSimpleName();
	private DatabaseController databaseController = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main_layout);
		
		Log.i(LOG_TAG, "Creating " + getClass() + " at " + System.currentTimeMillis());
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		if(this.databaseController != null) {
			OpenHelperManager.releaseHelper();
			this.databaseController = null;
		}
	}
	
	private DatabaseController getDatabaseController() {
		if(this.databaseController == null) {
			this.databaseController = OpenHelperManager.getHelper(this, DatabaseController.class);
		}
		
		return this.databaseController;
	}
	
}
