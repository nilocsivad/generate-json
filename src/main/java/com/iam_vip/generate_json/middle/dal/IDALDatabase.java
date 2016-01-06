/**
 * 
 */
package com.iam_vip.generate_json.middle.dal;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.middle.backend.db.GJDatabase;


/**
 * @author Colin
 */
@Repository
public interface IDALDatabase {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJDatabase t );
	
	/**
	 * @param list
	 * @return
	 */
	int inserts( List< GJDatabase > list );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	int delete( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	int update( GJDatabase t );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	GJDatabase queryOne( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	List< GJDatabase > query( GJDatabase t );
	
	/**
	 * @return
	 */
	List< GJDatabase > dbs();
	
}
