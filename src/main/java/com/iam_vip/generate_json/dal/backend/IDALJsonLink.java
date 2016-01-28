/**
 * 
 */
package com.iam_vip.generate_json.dal.backend;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.iam_vip.generate_json.zz.backend.table.GJJsonLink;

/**
 * @author Colin
 */
@Repository
public interface IDALJsonLink {
	
	/**
	 * @param t
	 * @return
	 */
	int insert( GJJsonLink t );
	
	/**
	 * @param uid
	 * @param suffix
	 * @return
	 */
	GJJsonLink queryOneBySuffix( @Param( "uid" ) int uid, @Param( "suffix" ) String suffix);
	
}
