/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.table;

import com.iam_vip.generate_json.gj.EntityBase;


/**
 * @author Colin
 */
public class GJJsonLink extends EntityBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 467002461753148727L;
	
	
	/**
	 * 
	 */
	public GJJsonLink() {}
	
	
	private Integer	uid;
	private int		type	= 100;	// 100:table 110:xml
	private String	target;
	private String	suffix;
					
					
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		
		return uid;
	}
	
	/**
	 * @param uid the uid to set
	 */
	public void setUid( Integer uid ) {
		
		this.uid = uid;
	}
	
	/**
	 * @return the type
	 */
	public int getType() {
		
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType( int type ) {
		
		this.type = type;
	}
	
	/**
	 * @return the target
	 */
	public String getTarget() {
		
		return target;
	}
	
	/**
	 * @param target the target to set
	 */
	public void setTarget( String target ) {
		
		this.target = target;
	}
	
	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		
		return suffix;
	}
	
	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix( String suffix ) {
		
		this.suffix = suffix;
	}
	
}
