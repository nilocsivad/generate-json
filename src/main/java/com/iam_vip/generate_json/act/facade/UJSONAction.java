/**
 * 
 */
package com.iam_vip.generate_json.act.facade;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iam_vip.generate_json.act.ActionBase;

/**
 * @author Colin
 *
 */
@Controller
@RequestMapping( value = { "/u/json" } )
public class UJSONAction extends ActionBase {

	private static final String VIEW_BASE = "facade/json/";

	/**
	 * 
	 */
	public UJSONAction() {
	}
	
	@RequestMapping( method = RequestMethod.GET, value = { "show/rule" } )
	public ModelAndView showRule( HttpServletRequest request, HttpServletResponse response, ModelMap model ) {
		return new ModelAndView( VIEW_BASE + "showRule", model );
	}

	@RequestMapping( method = RequestMethod.GET, value = { "2/new" } )
	public ModelAndView _2new( HttpServletRequest request, HttpServletResponse response, ModelMap model ) {
		return new ModelAndView( VIEW_BASE + "newJSON", model );
	}

}
