/**
 * 
 */
package com.iam_vip.generate_json.action.api;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iam_vip.generate_json.action.ActionBase;
import com.iam_vip.generate_json.rs.C;
import com.iam_vip.generate_json.gj.api.IDataService;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/api/json" } )
public class APIJSONAction extends ActionBase implements C {
	
	@Autowired private IDataService dataService;
	
	
	/**
	 * 
	 */
	public APIJSONAction() {}
	
	
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "get/{token}/**" } )
	public Map< String, Object > get( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String token ) throws IOException, DocumentException {
		
		String suffix = super.url_suffix( request, "/api/json/get/" + token );
		return dataService.get( response, token, suffix );
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "list/n/{token}/**" } )
	public List< Map< String, Object > > getList( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, String token ) {
		
		String suffix = super.url_suffix( request, "/api/json/list/n/" + token );
		System.out.println( "suffix: " + suffix );
		
		return dataService.getList( response, token, suffix, 1, 30 );
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "list/p/{token}/{page}/{size}/**" } )
	public List< Map< String, Object > > getList( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String token, @PathVariable int page, @PathVariable int size ) {
		
		String suffix = super.url_suffix( request, "/api/json/list/p/" + token + "/" + page + "/" + size );
		System.out.println( "suffix: " + suffix );
		
		return dataService.getList( response, token, suffix, page, size );
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "generate/random/{token}/**" } )
	public Map< String, Object > generate( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String token ) {
		
		String suffix = super.url_suffix( request, "/api/json/generate/random/" + token );
		System.out.println( "suffix: " + suffix );
		
		return dataService.generate( response, token, suffix, 100 );
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "generate/number/{num}/{token}/**" } )
	public Map< String, Object > generate( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable int num, @PathVariable String token ) {
		
		String suffix = super.url_suffix( request, "/api/json/generate/number/" + num + "/" + token );
		System.out.println( "suffix: " + suffix );
		
		return dataService.generate( response, token, suffix, num );
	}
	
}
