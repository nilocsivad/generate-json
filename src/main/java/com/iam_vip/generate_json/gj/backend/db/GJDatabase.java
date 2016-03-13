/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.db;

import java.util.List;

import com.iam_vip.generate_json.gj.EntityBase;
import com.iam_vip.generate_json.gj.backend.table.GJTable;


/**
 * @author Colin
 */
public class GJDatabase extends EntityBase {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1223182485681252127L;
	
	
	
	/**
	 * 
	 */
	public GJDatabase() {}
	
	
	private String			database;
	private String			dbType;			// InnoDB Cluster
	private int				tableCount	= 0;
	private List< GJTable >	tables;
							
							
							
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		
		return serialVersionUID;
	}
	
	/**
	 * @return the dbType
	 */
	public String getDbType() {
		
		return dbType;
	}
	
	/**
	 * @param dbType the dbType to set
	 */
	public void setDbType( String dbType ) {
		
		this.dbType = dbType;
	}
	
	/**
	 * @return the tableCount
	 */
	public int getTableCount() {
		
		return tableCount;
	}
	
	/**
	 * @param tableCount the tableCount to set
	 */
	public void setTableCount( int tableCount ) {
		
		this.tableCount = tableCount;
	}
	
	/**
	 * @return the tables
	 */
	public List< GJTable > getTables() {
		
		return tables;
	}
	
	/**
	 * @param tables the tables to set
	 */
	public void setTables( List< GJTable > tables ) {
		
		this.tables = tables;
	}
	
	
	/**
	 * @return the database
	 */
	public String getDatabase() {
		
		return database;
	}
	
	
	/**
	 * @param database the database to set
	 */
	public void setDatabase( String database ) {
		
		this.database = database;
	}
	
}
