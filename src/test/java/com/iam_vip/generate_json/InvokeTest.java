/**
 * 
 */
package com.iam_vip.generate_json;

import java.lang.reflect.Field;

import org.junit.Test;

import com.iam_vip.generate_json.zz.backend.table.GJJsonLink;

/**
 * @author Colin
 * 		
 */
public class InvokeTest {
	
	/**
	 * 
	 */
	public InvokeTest() {}
	
	@Test
	public void uuid() {
		
		Object obj = new GJJsonLink();
		Class< ? > cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		
		for ( Field field : fields ) {
			// System.out.print( "\"" + field.getName() + "\"," );
//			 System.out.println( field.getName() + "," );
			// System.out.println( "#{sr." + field.getName() + "}," );
//			System.out.println( "#{" + field.getName() + "}," );
			
			 String f = field.getName();
			 System.out.println( String.format( "<if test=\"%s != null and %s != ''\"> AND %s = #{%s} </if>", f, f, f, f ) );
		}
	}
	
}
