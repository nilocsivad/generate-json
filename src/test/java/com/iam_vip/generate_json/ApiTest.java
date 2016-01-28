/**
 * 
 */
package com.iam_vip.generate_json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author Colin
 */
@WebAppConfiguration
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( locations = { "classpath:config/spring-config.xml", "classpath:config/spring-servlet.xml" } )
public class ApiTest {
	
	
	@Autowired private WebApplicationContext wac;
	
	
	/**
	 * 
	 */
	public ApiTest() {}
	
	
	private MockMvc mvc;
	
	
	@Before
	public void init() {
		
		mvc = MockMvcBuilders.webAppContextSetup( wac ).build();
	}
	
	@Test
	public void run() throws Exception {
		
		// this.executeGetMethod( "/api/db/list" );
		// this.executeGetMethod( "/api/token/new" );
		// String token = "4932a826-4623-4929-9f46-9607ff66840e";
		// String url_suffix = "/list/data/4/http";
		// this.executeGetMethod( "/api/json/list/p/" + token + "/" + 2 + "/" + 30 + url_suffix );
		// this.executeGetMethod( "/api/table/list/1/2/3/4/5" );
		// String table = "tbl_4_http";
		// this.readSQL2_CreateTable( token, table, url_suffix );
		// Thread.sleep( 1000 );
		
		// Map< String, String > params = new HashMap< >( 2 );
		// // params.put( "ln", "helloYou" );
		// params.put( "pwd", "2016world" );
		// // this.executePostMethod( "/b/manager/new", params );
		// this.executePostMethod( "/api/token/get/" + ( "helloYou" ), params );
		// Thread.sleep( 1000 );
		// this.executePostMethod( "/api/token/get/" + ( "hello2016/60" ), params );
		
	}
	
	public void executePostMethod( String url ) throws Exception {
		
		this.executePostMethod( url, null );
	}
	
	public void executePostMethod( String url, Map< String, String > params ) throws Exception {
		
		MockHttpServletRequestBuilder rb = MockMvcRequestBuilders.post( url );
		if ( params != null && !params.isEmpty() ) {
			for ( Map.Entry< String, String > item : params.entrySet() )
				rb.param( item.getKey(), item.getValue() );
		}
		
		MvcResult result = mvc.perform( rb ).andReturn();
		System.out.println( result.getResponse().getContentAsString() );
	}
	
	public void executeGetMethod( String url ) throws Exception {
		
		this.executeGetMethod( url, null );
	}
	
	public void executeGetMethod( String url, Map< String, String > params ) throws Exception {
		
		MockHttpServletRequestBuilder rb = MockMvcRequestBuilders.get( url );
		if ( params != null && !params.isEmpty() ) {
			for ( Map.Entry< String, String > item : params.entrySet() )
				rb.param( item.getKey(), item.getValue() );
		}
		
		MvcResult result = mvc.perform( rb ).andReturn();
		System.out.println( result.getResponse().getContentAsString() );
	}
	
	public void readSQL2_CreateTable( String token, String table, String url_suffix ) throws Exception {
		
		BufferedReader reader = new BufferedReader( new FileReader( "E:\\tmp\\t-table.sql" ) );
		reader.readLine();
		
		String line = null;
		StringBuffer buf = new StringBuffer( 48 );
		while ( ( line = reader.readLine() ) != null ) {
			buf.append( line + " " );
			line = null;
		}
		reader.close();
		
		String sql = buf.toString();
		System.out.println( sql );
		
		MvcResult result = mvc.perform( MockMvcRequestBuilders.get( "/api/table/new/" + token + "/" + table ).param( "columns", sql ).param( "url_suffix", url_suffix ) ).andReturn();
		System.out.println( result.getResponse().getContentAsString() );
	}
	
}
