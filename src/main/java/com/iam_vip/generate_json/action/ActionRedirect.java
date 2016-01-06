/**
 * 
 */
package com.iam_vip.generate_json.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Colin
 */
@Controller
public class ActionRedirect extends ActionBase {
	
	protected static final String	REDIRECT			= "redirect:";
														
	private static final String		REDIRECT_FACADE		= "/f/home/index";
	private static final String		REDIRECT_BACKEND	= "/b/index";
														
														
	/**
	 * 
	 */
	public ActionRedirect() {}
	
	@RequestMapping( method = RequestMethod.GET, value = { "facade", "home" } )
	public ModelAndView facade( HttpServletRequest request, HttpServletResponse response, ModelMap model ) throws IOException {
		
		return new ModelAndView( REDIRECT + REDIRECT_FACADE, model );
	}
	
	@RequestMapping( method = RequestMethod.GET, value = { "backend", "back", "manage", "guanli" } )
	public ModelAndView backend( HttpServletRequest request, HttpServletResponse response, ModelMap model ) throws IOException {
		
		return new ModelAndView( REDIRECT + REDIRECT_BACKEND, model );
	}
	
}
