/**
 * 
 */
package com.iam_vip.generate_json.rs.u;

import java.beans.ConstructorProperties;

/**
 * @author Colin
 * 		
 */
public class AppConfigUtil {
	
	private static String key;
	
	
	/**
	 * Keep in mind that to make this work out of the box your code must be compiled with the debug flag enabled so that Spring can look up the parameter name from the constructor. If you can’t compile your code with debug flag (or don’t want to) you can use @ConstructorProperties JDK annotation to explicitly name your constructor arguments.
	 */
	@ConstructorProperties( { "key" } )
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
