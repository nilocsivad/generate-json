/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import java.util.List;

import com.iam_vip.generate_json.zz.IGeneral;


/**
 * @author Colin
 */
public interface ITableSVR extends IGeneral< GJTable > {
	
	/**
	 * @return
	 */
	List< GJTable > tables();
	
}
