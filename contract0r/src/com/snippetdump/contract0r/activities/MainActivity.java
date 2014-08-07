package com.snippetdump.contract0r.activities;

import android.os.Bundle;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.snippetdump.contract0r.controller.DatabaseController;

public class MainActivity extends AbstractActivity {
	
	private DatabaseController databaseController = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main_layout);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		if(this.databaseController != null) {
			OpenHelperManager.releaseHelper();
			this.databaseController = null;
		}
	}
}
