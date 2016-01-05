/**
 * 
 */
package com.iam_vip.generate_json.rs.u;

import java.util.List;

/**
 * @author Colin
 *
 */
public class MethodUtil {

	private static List< String > methods;

	/**
	 * 
	 */
	public MethodUtil( List< String > methods ) {
		MethodUtil.methods = methods;
	}

	/**
	 * @return the methods
	 */
	public static List< String > getMethods() {
		return methods;
	}

}
