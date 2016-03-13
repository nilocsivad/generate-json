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
public class OutputTest {
	
	/**
	 * 
	 */
	public OutputTest() {}
	
	@Test
	public void output() {
		
		String fn = "x-" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
		System.out.println( fn );
	}
	
}
