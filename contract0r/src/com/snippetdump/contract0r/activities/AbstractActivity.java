package com.snippetdump.contract0r.activities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.app.Activity;

public class AbstractActivity extends Activity{

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(AbstractActivity.class);
	
	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public void log(String message) {
		logger.info(message);
	}
	
}
