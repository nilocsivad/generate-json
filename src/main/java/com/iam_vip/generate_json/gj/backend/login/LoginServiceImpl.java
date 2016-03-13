/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.dal.backend.IDALLogin;

/**
 * @author Colin
 */
@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired private IDALLogin loginDAL;
	
	
	/**
	 * 
	 */
	public LoginServiceImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJLogin t ) {
		
		return loginDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJLogin > list ) {
		
		return loginDAL.inserts( list );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		return loginDAL.delete( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJLogin t ) {
		
		return loginDAL.update( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJLogin queryOne( Object primaryKeyVal ) {
		
		return loginDAL.queryOne( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJLogin > query( GJLogin t ) {
		
		return loginDAL.query( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJLogin t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJLogin t ) {
		
		return loginDAL.queryCountEq( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJLogin > queryEq( GJLogin t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
}
