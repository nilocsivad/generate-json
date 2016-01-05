/**
 * 
 */
package com.iam_vip.generate_json.action.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iam_vip.generate_json.action.ActionBase;

/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/b/db" } )
public class BDatabaseAction extends ActionBase {
	
	/**
	 * 
	 */
	public BDatabaseAction() {}
	
}
