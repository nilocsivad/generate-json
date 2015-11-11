/**
 * 
 */
package com.iam_vip.generate_json.rs.adapter;

import java.util.List;

/**
 * @author Colin
 *
 */
public class IgnoreMethods {

	private static List< String > methods;

	/**
	 * 
	 */
	public IgnoreMethods( List< String > methods ) {
		IgnoreMethods.methods = methods;
	}

	/**
	 * @return the methods
	 */
	public static List< String > getMethods() {
		return methods;
	}

}
