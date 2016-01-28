/**
 * 
 */
package com.iam_vip.generate_json.zz;

import java.io.Serializable;

import com.iam_vip.generate_json.rs.C;

/**
 * @author Colin
 */
public class EntityBase/* extends HashMap<String, Object> */ implements C, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7886466087785139025L;
	
	
	/**
	 * 
	 */
	public EntityBase() {
		super();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		return gson.toJson( this );
	}
	
}
