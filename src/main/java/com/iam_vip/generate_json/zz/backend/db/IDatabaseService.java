/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.db;

import java.util.List;
import java.util.Map;

import com.iam_vip.generate_json.zz.IGeneral;


/**
 * @author Colin
 */
public interface IDatabaseService extends IGeneral< GJDatabase > {
	
	/**
	 * @return
	 */
	List< Map< String, Object > > dbs();
	
	/**
	 * @param db
	 * @return
	 */
	int newDB( String db );
	
}
