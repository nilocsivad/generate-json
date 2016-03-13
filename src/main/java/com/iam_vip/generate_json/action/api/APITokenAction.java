/**
 * 
 */
package com.iam_vip.generate_json.action.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iam_vip.generate_json.action.ActionBase;
import com.iam_vip.generate_json.rs.C;
import com.iam_vip.generate_json.gj.api.GJToken;
import com.iam_vip.generate_json.gj.api.ITokenService;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/api/token" } )
public class APITokenAction extends ActionBase implements C {
	
	@Autowired private ITokenService tokenService;
	
	
	/**
	 * 
	 */
	public APITokenAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "get/{ln}" } )
	public GJToken getToken( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String ln, String pwd ) {
		
		return this.getToken( request, session, response, model, ln, pwd, 60 );
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "get/{ln}/{minutes}" } )
	public GJToken getToken( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String ln, String pwd, @PathVariable int minutes ) {
		
		return tokenService.getToken( ln, pwd, minutes );
	}
	
}
