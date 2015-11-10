/**
 * 
 */
package com.iam_vip.generate_json.rs.u;

/**
 * @author Colin
 *
 */
public class AppConfigUtil {

	private static String key;

	/**
	 * 
	 */
	public AppConfigUtil( String key ) {
		AppConfigUtil.key = key;
	}

	/**
	 * @return the key
	 */
	public static String getKey() {
		return key;
	}

}
