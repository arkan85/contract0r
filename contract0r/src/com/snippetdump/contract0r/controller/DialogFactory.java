package com.snippetdump.contract0r.controller;

import com.snippetdump.contract0r.model.Dialog;

public class DialogFactory extends Controller{

	
	public static Dialog createDialog() {
		Dialog dialog = new Dialog();
		
		return dialog;
	}
	
	private void setUpDialog(String title, String message) {
		
	}
	
}
