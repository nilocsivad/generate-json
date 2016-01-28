/**
 * 
 */
package com.iam_vip.generate_json.zz.api;

import java.util.Map;

import com.iam_vip.generate_json.zz.IGeneral;


/**
 * @author Colin
 */
public interface ITokenService extends IGeneral< GJToken > {

	/**
	 * @param ln
	 * @param pwd
	 * @param minutes 
	 * @return
	 */
	GJToken getToken( String ln, String pwd, int minutes );

	/**
	 * @param token
	 * @return
	 */
	Map< String, Object > validToken( String token );

}
