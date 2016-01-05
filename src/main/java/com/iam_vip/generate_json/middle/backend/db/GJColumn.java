/**
 * 
 */
package com.iam_vip.generate_json.middle.backend.db;

import com.iam_vip.generate_json.middle.EntityBase;


/**
 * @author Colin
 */
public class GJColumn extends EntityBase {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2023931323980974834L;
	
	
	
	/**
	 * 
	 */
	public GJColumn() {}
	
	
	private String	columnName;
	private String	javaType;
	private String	dbType;
	private int		lenth		= 0;
	private Object	defVal;
	private boolean	nullable	= true;
	private String	comment;
					
					
					
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		
		return serialVersionUID;
	}
	
	/**
	 * @return the columnName
	 */
	public String getColumnName() {
		
		return columnName;
	}
	
	/**
	 * @param columnName the columnName to set
	 */
	public void setColumnName( String columnName ) {
		
		this.columnName = columnName;
	}
	
	/**
	 * @return the javaType
	 */
	public String getJavaType() {
		
		return javaType;
	}
	
	/**
	 * @param javaType the javaType to set
	 */
	public void setJavaType( String javaType ) {
		
		this.javaType = javaType;
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
	 * @return the lenth
	 */
	public int getLenth() {
		
		return lenth;
	}
	
	/**
	 * @param lenth the lenth to set
	 */
	public void setLenth( int lenth ) {
		
		this.lenth = lenth;
	}
	
	/**
	 * @return the defVal
	 */
	public Object getDefVal() {
		
		return defVal;
	}
	
	/**
	 * @param defVal the defVal to set
	 */
	public void setDefVal( Object defVal ) {
		
		this.defVal = defVal;
	}
	
	/**
	 * @return the nullable
	 */
	public boolean isNullable() {
		
		return nullable;
	}
	
	/**
	 * @param nullable the nullable to set
	 */
	public void setNullable( boolean nullable ) {
		
		this.nullable = nullable;
	}
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		
		return comment;
	}
	
	/**
	 * @param comment the comment to set
	 */
	public void setComment( String comment ) {
		
		this.comment = comment;
	}
	
}
