/**
 * 
 */
package com.iam_vip.generate_json.gj.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;

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
	
	/**
	 * @param response
	 * @param token
	 * @param suffix
	 * @return
	 * @throws DocumentException
	 * @throws IOException
	 */
	Map< String, Object > get( HttpServletResponse response, String token, String suffix ) throws IOException, DocumentException;
	
}
