/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.login;

import com.iam_vip.generate_json.gj.EntityBase;


/**
 * @author Colin
 */
public class GJLogin extends EntityBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6029807199086960668L;
	
	
	/**
	 * 
	 */
	public GJLogin() {}
	
	
	private Integer	uid;
	private String	ln;
	private String	pwd;
	private String	createDT;
	private String	type;
	private int		status	= 100;
							
							
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
	 * @return the pwd
	 */
	public String getPwd() {
		
		return pwd;
	}
	
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd( String pwd ) {
		
		this.pwd = pwd;
	}
	
	/**
	 * @return the createDT
	 */
	public String getCreateDT() {
		
		return createDT;
	}
	
	/**
	 * @param createDT the createDT to set
	 */
	public void setCreateDT( String createDT ) {
		
		this.createDT = createDT;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		
		return type;
	}
	
	/**
	 * @param type the type to set
	 */
	public void setType( String type ) {
		
		this.type = type;
	}
	
	/**
	 * @return the status
	 */
	public int getStatus() {
		
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus( int status ) {
		
		this.status = status;
	}
	
	
	/**
	 * @return the ln
	 */
	public String getLn() {
		
		return ln;
	}
	
	
	/**
	 * @param ln the ln to set
	 */
	public void setLn( String ln ) {
		
		this.ln = ln;
	}
	
}
