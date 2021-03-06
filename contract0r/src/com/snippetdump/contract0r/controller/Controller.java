package com.snippetdump.contract0r.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Controller.class);
	
	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public void log(String message) {
		logger.info(message);
	}
}
