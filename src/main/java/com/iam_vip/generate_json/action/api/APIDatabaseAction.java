/**
 * 
 */
package com.iam_vip.generate_json.action.api;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iam_vip.generate_json.action.ActionBase;
import com.iam_vip.generate_json.gj.backend.db.GJDatabase;
import com.iam_vip.generate_json.gj.backend.db.IDatabaseService;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/api/db" } )
public class APIDatabaseAction extends ActionBase {
	
	@Autowired private IDatabaseService databaseService;
	
	
	/**
	 * 
	 */
	public APIDatabaseAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "list" } )
	public List< Map< String, Object > > listDatabase( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, GJDatabase param ) {
		
		return databaseService.dbs();
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "new" } )
	public int newDB( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, String db ) {
		
		return databaseService.newDB( db );
	}
	
}
