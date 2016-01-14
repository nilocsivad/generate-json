/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.zz.dal.IDALTable;


/**
 * @author Colin
 */
@Service
public class TableSVRImpl implements ITableSVR {
	
	@Autowired private IDALTable tableDAL;
	
	
	/**
	 * 
	 */
	public TableSVRImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#insert(java.lang.Object)
	 */
	@Override
	@Transactional
	public int insert( GJTable t ) {
		
		return tableDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#inserts(java.util.List)
	 */
	@Override
	@Transactional
	public int inserts( List< GJTable > list ) {
		
		return tableDAL.inserts( list );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#delete(java.lang.Object)
	 */
	@Override
	@Transactional
	public int delete( Object primaryKeyVal ) {
		
		return tableDAL.delete( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#update(java.lang.Object)
	 */
	@Override
	@Transactional
	public int update( GJTable t ) {
		
		return tableDAL.update( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJTable queryOne( Object primaryKeyVal ) {
		
		return tableDAL.queryOne( primaryKeyVal );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJTable > query( GJTable t ) {
		
		return tableDAL.query( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.backend.db.IDatabaseSVR#dbs()
	 */
	@Override
	public List< GJTable > tables() {
		
		return tableDAL.tables();
	}
	
}
