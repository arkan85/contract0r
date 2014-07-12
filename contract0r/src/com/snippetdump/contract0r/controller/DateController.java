package com.snippetdump.contract0r.controller;

import hirondelle.date4j.DateTime;

import java.util.Date;
import java.util.TimeZone;

public class DateController extends Controller{

	private DateTime mDateTime;
	private Long mLongDate;
	private TimeZone mTimeZone;
	
	public DateController(){
		this.mTimeZone = TimeZone.getDefault();
	}
	
	public DateController(DateTime mDateTime) {
		this.mDateTime = mDateTime;
	}

	public DateController(Long mLongDate) {
		this.mLongDate = mLongDate;
	}
	
	@SuppressWarnings("deprecation")
	public DateTime calculateDateTimeFromLong(Long input){
		if(input != null) {
			Date date = new Date(input);
			DateTime dt = DateTime.forDateOnly(date.getYear(), date.getMonth(), date.getDay());
			
			return dt;
		}
		
		return null;
	}
		
	@SuppressWarnings("deprecation")
	public Long calculateLongFromDateTime(DateTime input) {
		if(input != null) {
			Date date = new Date();
			date.setYear(input.getYear());
			date.setMonth(input.getMonth());
			date.setDate(input.getDay());
			
			return date.getTime();
		}
		
		return null;
	}
}
