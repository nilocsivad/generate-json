/**
 * 
 */
package com.iam_vip.generate_json.middle.backend.db;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


/**
 * @author Colin
 * 		
 */
public class DatabaseImpl implements IDatabaseService {
	
	/**
	 * 
	 */
	public DatabaseImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJDatabase > list ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJDatabase queryOne( Object primaryKeyVal ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJDatabase > query( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
}
