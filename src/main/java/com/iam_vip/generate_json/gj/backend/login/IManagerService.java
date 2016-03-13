/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.login;

import java.util.Map;

import com.iam_vip.generate_json.rs.C;
import com.iam_vip.generate_json.gj.IGeneral;


/**
 * @author Colin
 */
public interface IManagerService extends C, IGeneral< GJManager > {
	
	/**
	 * @param ln
	 * @param pwd
	 * @return
	 */
	Map< String, Object > newManager( String ln, String pwd );
	
}
