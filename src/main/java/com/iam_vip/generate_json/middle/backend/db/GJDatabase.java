/**
 * 
 */
package com.iam_vip.generate_json.middle.backend.db;

import java.util.List;

import com.iam_vip.generate_json.middle.EntityBase;


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
	
	
	private String			dbName;
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
	 * @return the dbName
	 */
	public String getDbName() {
		
		return dbName;
	}
	
	/**
	 * @param dbName the dbName to set
	 */
	public void setDbName( String dbName ) {
		
		this.dbName = dbName;
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
	
}
