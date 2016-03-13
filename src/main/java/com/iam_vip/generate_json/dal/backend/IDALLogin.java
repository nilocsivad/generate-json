/**
 * 
 */
package com.iam_vip.generate_json.dal.backend;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.gj.backend.login.GJLogin;

/**
 * @author Colin
 */
@Repository
public interface IDALLogin {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJLogin t );
	
	/**
	 * @param list
	 * @return
	 */
	int inserts( List< GJLogin > list );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	int delete( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	int update( GJLogin t );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	GJLogin queryOne( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	List< GJLogin > query( GJLogin t );

	/**
	 * @param t
	 * @return
	 */
	int queryCountEq( GJLogin t );
	
}
