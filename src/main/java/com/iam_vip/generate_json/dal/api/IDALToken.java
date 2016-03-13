/**
 * 
 */
package com.iam_vip.generate_json.dal.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.gj.api.GJToken;

/**
 * @author Colin
 */
@Repository
public interface IDALToken {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJToken t );
	
	/**
	 * @param list
	 * @return
	 */
	int inserts( List< GJToken > list );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	int delete( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	int update( GJToken t );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	GJToken queryOne( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	List< GJToken > query( GJToken t );
	
	/**
	 * @return
	 */
	List< GJToken > dbs();
	
	/**
	 * @param ln
	 * @param pwd
	 * @return
	 */
	GJToken getToken( @Param( value = "ln" ) String ln, @Param( value = "pwd" ) String pwd);
	
}
