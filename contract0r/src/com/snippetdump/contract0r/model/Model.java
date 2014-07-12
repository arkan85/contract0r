package com.snippetdump.contract0r.model;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import android.content.Context;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.snippetdump.contract0r.controller.DatabaseController;

/**
 * The Class Model.
 */
public class Model {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(Model.class);
	
	/** The database controller. */
	private DatabaseController databaseController;

	/**
	 * Log.
	 *
	 * @param message the message
	 */
	public void log(String message) {
		logger.info(message);
	}

	/**
	 * Create.
	 *
	 * @param context the context
	 */
	public void create(Context context) {
		if (this.databaseController == null) {
			this.databaseController = OpenHelperManager
					.getHelper(context, DatabaseController.class);
		}

		if (this instanceof Contract) {
			try {
				Dao<Contract, Integer> contractDao = this.databaseController.getContractDao();
				if (this != null) {
					contractDao.create((Contract) this);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (this instanceof Alarm) {
			try {
				Dao<Alarm, Integer> alarmDao = this.databaseController.getAlarmDao();
				if (this != null) {
					alarmDao.create((Alarm) this);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Update.
	 *
	 * @param context the context
	 */
	public void update(Context context) {
		if(this.databaseController == null) {
			this.databaseController = OpenHelperManager.getHelper(context, DatabaseController.class);
		}
		
		if(this instanceof  Contract) {
			try {
				Dao<Contract, Integer> contractDao = this.databaseController.getContractDao();
				if(this != null) {
					contractDao.update((Contract)this);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} else if(this instanceof Alarm) {
			try {
				Dao<Alarm, Integer> alarmDao = this.databaseController.getAlarmDao();
				if(this != null) {
					alarmDao.update((Alarm)this);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Read.
	 *
	 * @param <T> the generic type
	 * @param context the context
	 * @param id the id
	 * @param type the type
	 * @return the t
	 */
	public <T extends Model>T read(Context context, Integer id, Class<T> type) {
		if(this.databaseController == null) {
			this.databaseController = OpenHelperManager.getHelper(context, DatabaseController.class);
		}
		
		if(this instanceof Contract) {
			try {
				Dao<Contract, Integer> contractDao = this.databaseController.getContractDao();
				if(this != null) {
					return type.cast(contractDao.queryForId(id));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		} else if(this instanceof Alarm) {
			try {
				Dao<Alarm, Integer> alarmDao = this.databaseController.getAlarmDao();
				if(this != null) {
					return type.cast(alarmDao.queryForId(id));
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
	/**
	 * Delete.
	 *
	 * @param context the context
	 * @param id the id
	 */
	public void delete(Context context, Integer id) {
		if(this.databaseController == null) {
			this.databaseController = OpenHelperManager.getHelper(context, DatabaseController.class);
		}
		
		if(this instanceof Contract) {
			try {
				Dao<Contract, Integer> contractDao = this.databaseController.getContractDao();
				if(this != null) {
					contractDao.deleteById(id);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if(this instanceof Alarm) {
			try {
				Dao<Alarm, Integer> alarmDao = this.databaseController.getAlarmDao();
				if(this != null) {
					alarmDao.deleteById(id);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
