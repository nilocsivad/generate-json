/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.db;

import java.util.List;

import com.iam_vip.generate_json.zz.IGeneral;


/**
 * @author Colin
 */
public interface IDatabaseSVR extends IGeneral< GJDatabase > {

	/**
	 * @return
	 */
	List< GJDatabase > dbs();

}
