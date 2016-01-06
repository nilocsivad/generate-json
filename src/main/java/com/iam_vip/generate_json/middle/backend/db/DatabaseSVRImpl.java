/**
 * 
 */
package com.iam_vip.generate_json.middle.backend.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.middle.dal.IDALDatabase;


/**
 * @author Colin
 */
@Service
public class DatabaseSVRImpl implements IDatabaseSVR {
	
	@Autowired private IDALDatabase databaseDAL;
	
	
	/**
	 * 
	 */
	public DatabaseSVRImpl() {}
	
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
	public List< GJDatabase > dbs() {
		
		return databaseDAL.dbs();
	}
	
}
