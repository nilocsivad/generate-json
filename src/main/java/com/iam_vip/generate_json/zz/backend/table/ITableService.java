/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import java.util.List;
import java.util.Map;

import com.iam_vip.generate_json.zz.IGeneral;


/**
 * @author Colin
 */
public interface ITableService extends IGeneral< GJTable > {
	
	/**
	 * @return
	 */
	List< GJTable > tables();
	
	/**
	 * 
	 * @param token
	 * @param sql
	 * @param suffix
	 * @param url_suffix
	 * @param comment
	 * @return
	 */
	Map< String, Object > newTable( String token, String table, String columns, String url_suffix, String comment );
	
}
