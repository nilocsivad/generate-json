/**
 * 
 */
package com.iam_vip.generate_json.zz.api;

import java.util.UUID;

import com.iam_vip.generate_json.zz.EntityBase;


/**
 * @author Colin
 * 		
 */
public class GJToken extends EntityBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6986029638566038607L;
	
	
	/**
	 * 
	 */
	public GJToken() {}
	
	
	private String	token;
	private Integer	uid;
	private long	stop;
					
					
	/**
	 * @param token
	 */
	public GJToken( int uid ) {
		this( UUID.randomUUID().toString(), uid );
	}
	
	/**
	 * @param token
	 */
	public GJToken( String token, int uid ) {
		this( token, uid, ( System.currentTimeMillis() + 30 * 60 * 1000 ) );
	}
	
	/**
	 * @param token
	 * @param start
	 * @param stop
	 */
	public GJToken( int uid, long stop ) {
		this( UUID.randomUUID().toString(), uid, stop );
	}
	
	/**
	 * @param token
	 * @param start
	 * @param stop
	 */
	public GJToken( String token, int uid, long stop ) {
		super();
		this.token = token;
		this.uid = uid;
		this.stop = stop;
	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		
		return token;
	}
	
	/**
	 * @param token the token to set
	 */
	public void setToken( String token ) {
		
		this.token = token;
	}
	
	/**
	 * @return the stop
	 */
	public long getStop() {
		
		return stop;
	}
	
	/**
	 * @param stop the stop to set
	 */
	public void setStop( long stop ) {
		
		this.stop = stop;
	}
	
	
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
	
}
