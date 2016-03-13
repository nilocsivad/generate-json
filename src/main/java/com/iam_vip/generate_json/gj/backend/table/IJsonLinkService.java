/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.table;

import com.iam_vip.generate_json.gj.IGeneral;

/**
 * @author Colin
 */
public interface IJsonLinkService extends IGeneral< GJJsonLink > {
	
	/**
	 * @param uid
	 * @param suffix
	 * @return
	 */
	GJJsonLink queryOneBySuffix( int uid, String suffix );
	
}
