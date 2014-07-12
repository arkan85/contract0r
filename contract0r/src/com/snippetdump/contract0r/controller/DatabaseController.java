package com.snippetdump.contract0r.controller;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.snippetdump.contract0r.model.Alarm;
import com.snippetdump.contract0r.model.Contract;

public class DatabaseController extends OrmLiteSqliteOpenHelper{

	private static final String DATABASE_NAME = "contract0r.db"; 
	private static final int DATABASE_VERSION = 1;
	
	private Dao<Contract, Integer> contractDao = null;
	private Dao<Alarm, Integer> alarmDao = null;
	
	public DatabaseController(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
		try {
			TableUtils.createTable(connectionSource, Contract.class);
			TableUtils.createTable(connectionSource, Alarm.class);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, ConnectionSource connectionSource, int oldVersion, int newVersion) {
		try {
			TableUtils.dropTable(connectionSource, Contract.class, true);
			TableUtils.dropTable(connectionSource, Contract.class, true);
			this.onCreate(db, connectionSource);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Dao<Contract, Integer> getContractDao() throws SQLException {
		if(contractDao == null) {
			contractDao = this.getDao(Contract.class);
		}
		
		return contractDao;
	}
	
	public Dao<Alarm, Integer> getAlarmDao() throws SQLException {
		if(this.alarmDao == null) {
			this.alarmDao = this.getDao(Alarm.class);
		}

		return alarmDao;
	}

}


