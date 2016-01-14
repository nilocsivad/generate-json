/**
 * 
 */
package com.iam_vip.generate_json.zz.facade;

import com.iam_vip.generate_json.zz.EntityBase;

/**
 * @author Colin
 */
public class OnlineToken extends EntityBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7782902577624166062L;

	/**
	 * 
	 */
	public OnlineToken() {
	}

	private String uuid;
	private String token;
	private String startDT;
	private String stopDT;

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid( String uuid ) {
		this.uuid = uuid;
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
	 * @return the startDT
	 */
	public String getStartDT() {
		return startDT;
	}

	/**
	 * @param startDT the startDT to set
	 */
	public void setStartDT( String startDT ) {
		this.startDT = startDT;
	}

	/**
	 * @return the stopDT
	 */
	public String getStopDT() {
		return stopDT;
	}

	/**
	 * @param stopDT the stopDT to set
	 */
	public void setStopDT( String stopDT ) {
		this.stopDT = stopDT;
	}

}
