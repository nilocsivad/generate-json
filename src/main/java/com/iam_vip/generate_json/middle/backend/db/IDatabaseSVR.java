/**
 * 
 */
package com.iam_vip.generate_json.middle.backend.db;

import java.util.List;

import com.iam_vip.generate_json.middle.IGeneral;


/**
 * @author Colin
 */
public interface IDatabaseSVR extends IGeneral< GJDatabase > {

	/**
	 * @return
	 */
	List< GJDatabase > dbs();

}
