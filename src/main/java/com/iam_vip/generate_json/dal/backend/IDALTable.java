/**
 * 
 */
package com.iam_vip.generate_json.dal.backend;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.zz.backend.table.GJTable;


/**
 * @author Colin
 */
@Repository
public interface IDALTable {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJTable t );
	
	/**
	 * @param list
	 * @return
	 */
	int inserts( List< GJTable > list );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	int delete( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	int update( GJTable t );
	
	/**
	 * @param primaryKeyVal
	 * @return
	 */
	GJTable queryOne( Object primaryKeyVal );
	
	/**
	 * @param t
	 * @return
	 */
	List< GJTable > query( GJTable t );
	
	/**
	 * @return
	 */
	List< GJTable > tables();
	
	int newTable( @Param( "db" ) String db, @Param( "table" ) String table, @Param( "columns" ) String columns, @Param( "comment" ) String comment);
	
}
