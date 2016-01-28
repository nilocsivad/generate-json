/**
 * 
 */
package com.iam_vip.generate_json.zz.api;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.iam_vip.generate_json.rs.C;

/**
 * @author Colin
 */
public interface IDataService extends C {
	
	/**
	 * @param response
	 * @param token
	 * @param suffix
	 * @param size
	 * @param page
	 * @return
	 */
	List< Map< String, Object > > getList( HttpServletResponse response, String token, String suffix, int page, int size );
	
	/**
	 * @param response
	 * @param token
	 * @param suffix
	 * @param num
	 * @return
	 */
	Map< String, Object > generate( HttpServletResponse response, String token, String suffix, int num );
	
}
