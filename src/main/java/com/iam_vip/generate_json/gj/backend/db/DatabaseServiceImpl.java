/**
 * 
 */
package com.iam_vip.generate_json.gj.backend.db;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.dal.backend.IDALDatabase;


/**
 * @author Colin
 */
@Service
public class DatabaseServiceImpl implements IDatabaseService {
	
	@Autowired private IDALDatabase databaseDAL;
	
	
	/**
	 * 
	 */
	public DatabaseServiceImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJDatabase t ) {
		
		return databaseDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJDatabase > list ) {
		
		return databaseDAL.inserts( list );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		return databaseDAL.delete( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJDatabase t ) {
		
		return databaseDAL.update( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJDatabase queryOne( Object primaryKeyVal ) {
		
		return databaseDAL.queryOne( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJDatabase > query( GJDatabase t ) {
		
		return databaseDAL.query( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.backend.db.IDatabaseSVR#dbs()
	 */
	@Override
	public List< Map< String, Object > > dbs() {
		
		return databaseDAL.dbs();
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.backend.db.IDatabaseService#execute(java.lang.String)
	 */
	@Override
	public int newDB( String db ) {
		
		return databaseDAL.newDB( db );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.gj.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJDatabase > queryEq( GJDatabase t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
}
