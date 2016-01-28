/**
 * 
 */
package com.iam_vip.generate_json.dal.backend;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.zz.backend.db.GJDatabase;


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
	List< Map< String, Object > > dbs();
	
	/**
	 * @param db
	 * @return
	 */
	int newDB( @Param( "db" ) String db);
	
}
