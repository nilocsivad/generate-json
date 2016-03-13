/**
 * 
 */
package com.iam_vip.generate_json.gj.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iam_vip.generate_json.dal.api.IDALData;
import com.iam_vip.generate_json.gj.backend.table.GJJsonLink;
import com.iam_vip.generate_json.gj.backend.table.IJsonLinkService;
import com.iam_vip.generate_json_java.GenerateJson;

/**
 * @author Colin
 */
@Service
public class DataServiceImpl implements IDataService {
	
	@Autowired private ITokenService	tokenService;
	@Autowired private IJsonLinkService	jsonLinkService;
										
	@Autowired private IDALData			dataDAL;
										
										
	/**
	 * 
	 */
	public DataServiceImpl() {}
	
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.api.IDataService#getList(javax.servlet.http.HttpServletResponse, java.lang.String, java.lang.String, int, int)
	 */
	@Override
	public List< Map< String, Object > > getList( HttpServletResponse response, String token, String suffix, int page, int size ) {
		
		List< Map< String, Object > > list = new ArrayList< Map< String, Object > >( 0 );
		
		Map< String, Object > map = tokenService.validToken( token );
		if ( map.containsKey( "uid" ) ) {
			
			int uid = Integer.parseInt( map.get( "uid" ).toString() );
			
			String db = String.format( FMT_DB_NAME, uid );
			
			GJJsonLink link = jsonLinkService.queryOneBySuffix( uid, suffix );
			
			if ( link != null ) {
				
				page = page < 1 ? 1 : page;
				size = size < 1 ? 30 : size;
				long start = ( page - 1 ) * size;
				
				list = dataDAL.getList( db + "." + link.getTarget(), start, size );
			}
		}
		else {
			response.addDateHeader( JSON_KEY, 9000 );
		}
		return list;
	}
	
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.api.IDataService#generate(javax.servlet.http.HttpServletResponse, java.lang.String, java.lang.String, int)
	 */
	@Override
	public Map< String, Object > generate( HttpServletResponse response, String token, String suffix, int num ) {
		
		Map< String, Object > map = tokenService.validToken( token );
		if ( map.containsKey( "uid" ) ) {
			
			int uid = Integer.parseInt( map.get( "uid" ).toString() );
			
			// String db = String.format( FMT_DB_NAME, uid );
			
			GJJsonLink link = jsonLinkService.queryOneBySuffix( uid, suffix );
			
			if ( link != null ) {
				
				// list = dataDAL.getList( db + "." + link.getTarget(), start, size );
			}
		}
		else {
			response.addDateHeader( JSON_KEY, 9000 );
		}
		
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.api.IDataService#get(javax.servlet.http.HttpServletResponse, java.lang.String, java.lang.String)
	 */
	@Override
	public Map< String, Object > get( HttpServletResponse response, String token, String suffix ) throws IOException, DocumentException {
		
		Map< String, Object > r = new HashMap< String, Object >( 0 );
		
		Map< String, Object > map = tokenService.validToken( token );
		if ( map.containsKey( "uid" ) ) {
			
			int uid = Integer.parseInt( map.get( "uid" ).toString() );
			
			GJJsonLink link = jsonLinkService.queryOneBySuffix( uid, suffix );
			
			if ( link != null ) {
				
				String xml = link.getTarget();
				System.out.println( "xml " + xml );
				r = new GenerateJson( xml ).generate();
			}
			else {
				response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
			}
			return r;
		}
		else {
			response.setStatus( HttpServletResponse.SC_BAD_REQUEST );
			return map;
		}
	}
	
}
