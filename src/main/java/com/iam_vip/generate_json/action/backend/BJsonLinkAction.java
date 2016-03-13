/**
 * 
 */
package com.iam_vip.generate_json.action.backend;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.iam_vip.generate_json.action.ActionBase;
import com.iam_vip.generate_json.gj.backend.table.GJJsonLink;
import com.iam_vip.generate_json.gj.backend.table.IJsonLinkService;
import com.iam_vip.generate_json.rs.C;
import com.iam_vip.generate_json.rs.u.ConfigUtil;


/**
 * @author Colin
 */
@Controller
@RequestMapping( value = { "/b/json/link" } )
public class BJsonLinkAction extends ActionBase implements C {
	
	@Autowired private IJsonLinkService jsonLinkService;
	
	
	/**
	 * 
	 */
	public BJsonLinkAction() {}
	
	@ResponseBody
	@RequestMapping( method = RequestMethod.POST, value = { "new" } )
	public Map< String, Object > newXml( HttpServletRequest request, HttpSession session, HttpServletResponse response, ModelMap model, GJJsonLink link, MultipartFile xml ) throws IOException {
		
		Map< String, Object > r = new HashMap< >( 1 );
		if ( xml == null || xml.isEmpty() ) {
			r.put( JSON_KEY, "未检测到任何文件!" );
			return null;
		}
		
		String xf = ConfigUtil.getXmlFolder();
		String fn = "x-" + System.currentTimeMillis() + "-" + UUID.randomUUID().toString();
		
		OutputStream out = new FileOutputStream( new File( xf, fn ) );
		out.write( xml.getBytes() );
		out.close();
		
		jsonLinkService.insert( link );
		
		return r;
	}
	
}
