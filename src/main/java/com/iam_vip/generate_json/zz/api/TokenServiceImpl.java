/**
 * 
 */
package com.iam_vip.generate_json.zz.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.dal.api.IDALToken;


/**
 * @author Colin
 */
@Service
public class TokenServiceImpl implements ITokenService {
	
	@Autowired private IDALToken tokenDAL;
	
	
	/**
	 * 
	 */
	public TokenServiceImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJToken t ) {
		
		return tokenDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJToken > list ) {
		
		return tokenDAL.inserts( list );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		return tokenDAL.delete( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJToken t ) {
		
		return tokenDAL.update( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJToken queryOne( Object primaryKeyVal ) {
		
		return tokenDAL.queryOne( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJToken > query( GJToken t ) {
		
		return tokenDAL.query( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJToken t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJToken t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJToken > queryEq( GJToken t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.api.ITokenService#getToken(java.lang.String, java.lang.String, int)
	 */
	@Override
	public GJToken getToken( String ln, String pwd, int minutes ) {
		
		GJToken token = tokenDAL.getToken( ln, pwd );
		if ( token != null ) {
			final GJToken t = new GJToken( token.getUid(), ( System.currentTimeMillis() + minutes * 60 * 1000 ) );
			
			new Thread() {
				
				public void run() {
					
					tokenDAL.update( t );
				}
			}.start();
			
			return t;
		}
		return new GJToken();
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.api.ITokenService#validToken(java.lang.String)
	 */
	@Override
	public Map< String, Object > validToken( String token ) {
		
		Map< String, Object > map = new HashMap< >( 2 );
		
		GJToken tk = this.queryOne( token );
		
		if ( tk.getStop() > System.currentTimeMillis() ) {
			map.put( "uid", tk.getUid() );
		}
		else {
			map.put( JSON_KEY, 9000 );
			map.put( JSON_RESULT_KEY, "Token已超时!" );
		}
		
		return map;
	}
	
}
