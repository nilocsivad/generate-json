/**
 * 
 */
package com.iam_vip.generate_json.middle;

import java.util.List;

import com.iam_vip.generate_json.rs.C;

/**
 * @author Colin
 */
public interface IGeneral< T > extends C {
	
	int insert( T t );
	
	int inserts( List< T > list );
	
	int delete( Object primaryKeyVal );
	
	int update( T t );
	
	T queryOne( Object primaryKeyVal );
	
	List< T > query( T t );
	
}
