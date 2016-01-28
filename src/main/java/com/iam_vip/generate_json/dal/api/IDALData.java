/**
 * 
 */
package com.iam_vip.generate_json.dal.api;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Colin
 */
@Repository
public interface IDALData {
	
	/**
	 * @param db_table
	 * @param start
	 * @param size
	 * @return
	 */
	List< Map< String, Object > > getList( @Param( "db_table" ) String db_table, @Param( "start" ) long start, @Param( "size" ) int size);
	
}
