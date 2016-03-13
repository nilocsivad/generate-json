/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.login;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.dal.backend.IDALManager;
import com.iam_vip.generate_json.gj.api.GJToken;
import com.iam_vip.generate_json.gj.api.ITokenService;

/**
 * @author Colin
 */
@Service
public class ManagerServiceImpl implements IManagerService {
	
	@Autowired private ILoginService	loginService;
	@Autowired private ITokenService	tokenService;
										
	@Autowired private IDALManager		managerDAL;
										
										
	/**
	 * 
	 */
	public ManagerServiceImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJManager t ) {
		
		return managerDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJManager > list ) {
		
		return managerDAL.inserts( list );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		return managerDAL.delete( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJManager t ) {
		
		return managerDAL.update( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJManager queryOne( Object primaryKeyVal ) {
		
		return managerDAL.queryOne( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJManager > query( GJManager t ) {
		
		return managerDAL.query( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.backend.manage.IManagerService#newManager(java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public Map< String, Object > newManager( String ln, String pwd ) {
		
		Map< String, Object > map = new HashMap< >( 2 );
		
		GJLogin pl = new GJLogin();
		pl.setLn( ln );
		
		long len = loginService.queryCountEq( pl );
		if ( len > 0 ) {
			map.put( JSON_KEY, 1000 );
			map.put( JSON_RESULT_KEY, "登录名已被占用!" );
		}
		else {
			// <ln-not-in-use>
			
			GJManager m = new GJManager();
			m.setRealname( ln );
			
			int c = this.insert( m );
			if ( c > 0 ) {
				
				GJLogin l = new GJLogin();
				l.setUid( m.getUid() );
				l.setLn( ln );
				l.setPwd( pwd );
				l.setStatus( 100 );
				l.setType( this.calcType( ln ) );
				
				if ( loginService.insert( l ) > 0 ) {
					m.add( l );
					map.put( JSON_KEY, 1 );
					map.put( JSON_RESULT_KEY, m );
				}
				else {
					this.delete( m.getUid() );
					map.put( JSON_KEY, 2000 );
					map.put( JSON_RESULT_KEY, "操作未成功,请重试!" );
				}
				
				GJToken token = new GJToken( m.getUid() );
				tokenService.insert( token );
				
			}
			else {
				map.put( JSON_KEY, 2000 );
				map.put( JSON_RESULT_KEY, "操作未成功,请重试!" );
			}
			
		} // <ln-not-in-use />
		return map;
	}
	
	/**
	 * @param ln
	 * @return
	 */
	private String calcType( String ln ) {
		
		String type = "string";
		
		if ( ln.contains( "@" ) ) {
			type = "email";
		}
		
		return type;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJManager t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJManager t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJManager > queryEq( GJManager t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
}
