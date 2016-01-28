/**
 * 
 */
package com.iam_vip.generate_json.action.backend;

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
import com.iam_vip.generate_json.zz.backend.login.IManagerService;

/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/b/manager" } )
public class BManagerAction extends ActionBase {
	
	@Autowired private IManagerService managerService;
	
	
	/**
	 * 
	 */
	public BManagerAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "new" } )
	public Map< String, Object > newManager( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, String ln, String pwd ) {
		
		return managerService.newManager( ln, pwd );
	}
	
}
