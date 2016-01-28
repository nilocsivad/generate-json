/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.login;

import java.util.ArrayList;
import java.util.List;

import com.iam_vip.generate_json.zz.EntityBase;


/**
 * @author Colin
 */
public class GJManager extends EntityBase {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1740642720536829911L;
	
	
	/**
	 * 
	 */
	public GJManager() {}
	
	
	private Integer			uid;
	private Integer			companyID;
	private String			realname;
	private String			gender;
							
	private List< GJLogin >	accounts;
							
							
	public void add( GJLogin l ) {
		
		if ( accounts == null ) accounts = new ArrayList< >( 1 );
		accounts.add( l );
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
	
	/**
	 * @return the companyID
	 */
	public Integer getCompanyID() {
		
		return companyID;
	}
	
	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID( Integer companyID ) {
		
		this.companyID = companyID;
	}
	
	/**
	 * @return the realname
	 */
	public String getRealname() {
		
		return realname;
	}
	
	/**
	 * @param realname the realname to set
	 */
	public void setRealname( String realname ) {
		
		this.realname = realname;
	}
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		
		return gender;
	}
	
	/**
	 * @param gender the gender to set
	 */
	public void setGender( String gender ) {
		
		this.gender = gender;
	}
	
	
	/**
	 * @return the accounts
	 */
	public List< GJLogin > getAccounts() {
		
		return accounts;
	}
	
	
	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts( List< GJLogin > accounts ) {
		
		this.accounts = accounts;
	}
	
}
