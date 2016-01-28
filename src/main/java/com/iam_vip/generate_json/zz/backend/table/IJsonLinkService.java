/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import com.iam_vip.generate_json.zz.IGeneral;

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
