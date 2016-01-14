/**
 * 
 */
package com.iam_vip.generate_json.action.api;

import java.util.List;

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
import com.iam_vip.generate_json.zz.backend.table.GJTable;
import com.iam_vip.generate_json.zz.backend.table.ITableSVR;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/api/table" } )
public class APITableAction extends ActionBase {
	
	@Autowired private ITableSVR tableSVR;
	
	
	/**
	 * 
	 */
	public APITableAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "list" } )
	public List< GJTable > listTables( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, GJTable param ) {
		
		return tableSVR.tables();
	}
	
}
