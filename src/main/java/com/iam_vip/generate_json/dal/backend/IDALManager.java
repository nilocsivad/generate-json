/**
 * 
 */
package com.iam_vip.generate_json.dal.backend;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.gj.backend.login.GJManager;

/**
 * @author Colin
 */
@Repository
public interface IDALManager {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJManager t );
	
	/**
	 * @param list
	 * @return
	 */
	int inserts( List< GJManager > list );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	int delete( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	int update( GJManager t );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	GJManager queryOne( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	List< GJManager > query( GJManager t );
	
}
