package com.snippetdump.contract0r.model;

import hirondelle.date4j.DateTime;

import java.util.TimeZone;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * The Class Alarm.
 */
@DatabaseTable(tableName = "alarms")
public class Alarm extends Model{
	
	private final String ALARM_CREATED = "Alarm created";
	private final String WHITE_SPACE = " ";

	/** The id. */
	@DatabaseField(id = true)
	private int id;
	
	/** The name. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private String name;
	
	/** The date. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private long date;
	
	/**
	 * Instantiates a new alarm.
	 */
	public Alarm(){
		StringBuffer buf = new StringBuffer("");
		log(buf.append(this.ALARM_CREATED).append(this.WHITE_SPACE).append(DateTime.now(TimeZone.getDefault())).toString());
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public long getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(long date) {
		this.date = date;
	}
	
}
