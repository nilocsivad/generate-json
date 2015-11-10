/**
 * 
 */
package com.iam_vip.generate_json;

import java.util.UUID;

import org.junit.Test;

/**
 * @author Colin
 *
 */
public class Output {

	/**
	 * 
	 */
	public Output() {
	}

	@Test
	public void uuid() {
		System.out.println( UUID.randomUUID().toString().length() );
	}

}
