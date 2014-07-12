package com.snippetdump.contract0r.model;

import java.util.TimeZone;

import hirondelle.date4j.DateTime;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * The Class Contract.
 */
@DatabaseTable(tableName = "contracts")
public class Contract extends Model{
	
	private final String CONTRACT_CREATED = "Contract created";
	private final String WHITE_SPACE = " ";
	
	/** The id. */
	@DatabaseField(generatedId = true)
	private int id;
	
	/** The name. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private String name;
	
	/** The partner. */
	@DatabaseField(useGetSet = true)
	private String partner;
	
	/** The start. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private long start;
	
	/** The end. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private long end;
	
	/** The duration. */
	@DatabaseField(useGetSet = true)
	private int duration;
	
	/** oncost payed regulary. */
	@DatabaseField(useGetSet = true)
	private double oncost;
	
	/** Overheads payed once. */
	@DatabaseField(useGetSet = true)
	private double overheads;
	
	/** The comment. */
	@DatabaseField(useGetSet = true)
	private String comment;
	
	/** The cancellation due date. */
	@DatabaseField(canBeNull = false, useGetSet = true)
	private long cancellationDueDate;
	
	/** The duration unit.	 */
	@DatabaseField(useGetSet = true)
	private String durationUnit;
	
	/** The alarm. */
	private Alarm alarm;
	
	/**
	 * Instantiates a new contract.
	 */
	public Contract(){
		StringBuffer buf = new StringBuffer("");
		log(buf.append(this.CONTRACT_CREATED).append(this.WHITE_SPACE).append(DateTime.now(TimeZone.getDefault())).toString());
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
	 * Gets the partner.
	 *
	 * @return the partner
	 */
	public String getPartner() {
		return partner;
	}

	/**
	 * Sets the partner.
	 *
	 * @param partner the new partner
	 */
	public void setPartner(String partner) {
		this.partner = partner;
	}

	/**
	 * Gets the start.
	 *
	 * @return the start
	 */
	public long getStart() {
		return start;
	}

	/**
	 * Sets the start.
	 *
	 * @param start the new start
	 */
	public void setStart(long start) {
		this.start = start;
	}

	/**
	 * Gets the end.
	 *
	 * @return the end
	 */
	public long getEnd() {
		return end;
	}

	/**
	 * Sets the end.
	 *
	 * @param end the new end
	 */
	public void setEnd(long end) {
		this.end = end;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Gets the oncost.
	 *
	 * @return the oncost
	 */
	public double getOncost() {
		return oncost;
	}

	/**
	 * Sets the oncost.
	 *
	 * @param oncost the new oncost
	 */
	public void setOncost(double oncost) {
		this.oncost = oncost;
	}

	/**
	 * Gets the overheads.
	 *
	 * @return the overheads
	 */
	public double getOverheads() {
		return overheads;
	}

	/**
	 * Sets the overheads.
	 *
	 * @param overheads the new overheads
	 */
	public void setOverheads(double overheads) {
		this.overheads = overheads;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Gets the cancellation due date.
	 *
	 * @return the cancellation due date
	 */
	public long getCancellationDueDate() {
		return cancellationDueDate;
	}

	/**
	 * Sets the cancellation due date.
	 *
	 * @param cancellationDueDate the new cancellation due date
	 */
	public void setCancellationDueDate(long cancellationDueDate) {
		this.cancellationDueDate = cancellationDueDate;
	}

	/**
	 * Gets the alarm.
	 *
	 * @return the alarm
	 */
	public Alarm getAlarm() {
		return alarm;
	}

	/**
	 * Sets the alarm.
	 *
	 * @param alarm the new alarm
	 */
	public void setAlarm(Alarm alarm) {
		this.alarm = alarm;
	}
	
	/**
	 * Gets the duration unit.
	 *
	 * @return the duration unit
	 */
	public String getDurationUnit() {
		return durationUnit;
	}

	/**
	 * Sets the duration unit.
	 *
	 * @param durationUnit the new duration unit
	 */
	public void setDurationUnit(String durationUnit) {
		this.durationUnit = durationUnit;
	}
}
