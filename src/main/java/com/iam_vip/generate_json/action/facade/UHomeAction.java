/**
 * 
 */
package com.iam_vip.generate_json.action.facade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iam_vip.generate_json.action.ActionBase;

/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/u/home" } )
public class UHomeAction extends ActionBase {
	
	private static final String VIEW_BASE = "facade/";
	
	
	/**
	 * 
	 */
	public UHomeAction() {}
	
	@RequestMapping( method = RequestMethod.GET, value = { "", "index", "home" } )
	public ModelAndView index( HttpServletRequest request, HttpServletResponse response, ModelMap model ) {
		
		return new ModelAndView( VIEW_BASE + "index", model );
	}
	
}
