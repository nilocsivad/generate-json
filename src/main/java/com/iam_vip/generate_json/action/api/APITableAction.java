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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iam_vip.generate_json.action.ActionBase;
import com.iam_vip.generate_json.rs.C;
import com.iam_vip.generate_json.zz.backend.table.GJTable;
import com.iam_vip.generate_json.zz.backend.table.ITableService;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/api/table" } )
public class APITableAction extends ActionBase implements C {
	
	@Autowired private ITableService tableService;
	
	
	/**
	 * 
	 */
	public APITableAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "list/**" } )
	public List< GJTable > listTables( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model ) {
		
		return tableService.tables();
	}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.GET, value = { "new/{token}/{table}" } )
	public Map< String, Object > newTable( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, @PathVariable String token, @PathVariable String table, String columns, String url_suffix, @RequestParam( defaultValue = "" ) String comment) {
		
		return tableService.newTable( token, table, columns, url_suffix, comment );
	}
	
}
