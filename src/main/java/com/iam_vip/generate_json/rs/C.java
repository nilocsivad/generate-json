/**
 * 
 */
package com.iam_vip.generate_json.rs;

import com.google.gson.Gson;

/**
 * @author Colin
 * 		
 */
public interface C {
	
	String	JSON_KEY			= "key";
	String	JSON_RESULT_KEY		= "result";
	String	JSON_EXTRA_KEY		= "extra";
								
	String	DEFAULT_IMG_SUFFIX	= "jpg";
								
	String	PACKAGE_BACKEND		= "com.iam_vip.generate_json.act.backend";
	String	PACKAGE_FACADE		= "com.iam_vip.generate_json.act.facade";
								
	String	ONLINE_MANAGER		= "online_manager";
	String	ONLINE_WEBUSER		= "online_webuser";
								
	String	FMT_DB_NAME			= "db_4_json_%d";
								
								
	Gson	gson				= new Gson();
								
}
