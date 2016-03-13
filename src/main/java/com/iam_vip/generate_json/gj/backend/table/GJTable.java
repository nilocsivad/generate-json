/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.table;

import java.util.List;

import com.iam_vip.generate_json.gj.EntityBase;


/**
 * @author Colin
 */
public class GJTable extends EntityBase {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1686229325783709765L;
	
	
	
	/**
	 * 
	 */
	public GJTable() {}
	
	
	private String				tableName;
	private int					columnCount	= 0;
	private List< GJColumn >	columns;
								
								
								
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		
		return serialVersionUID;
	}
	
	/**
	 * @return the tableName
	 */
	public String getTableName() {
		
		return tableName;
	}
	
	/**
	 * @param tableName the tableName to set
	 */
	public void setTableName( String tableName ) {
		
		this.tableName = tableName;
	}
	
	/**
	 * @return the columnCount
	 */
	public int getColumnCount() {
		
		return columnCount;
	}
	
	/**
	 * @param columnCount the columnCount to set
	 */
	public void setColumnCount( int columnCount ) {
		
		this.columnCount = columnCount;
	}
	
	/**
	 * @return the columns
	 */
	public List< GJColumn > getColumns() {
		
		return columns;
	}
	
	/**
	 * @param columns the columns to set
	 */
	public void setColumns( List< GJColumn > columns ) {
		
		this.columns = columns;
	}
	
}
