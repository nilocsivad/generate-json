/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iam_vip.generate_json.dal.backend.IDALTable;
import com.iam_vip.generate_json.zz.api.ITokenService;
import com.iam_vip.generate_json.zz.backend.db.IDatabaseService;


/**
 * @author Colin
 */
@Service
public class TableServiceImpl implements ITableService {
	
	@Autowired private IDatabaseService	databaseService;
	@Autowired private ITokenService	tokenService;
	@Autowired private IJsonLinkService	jsonLinkService;
										
	@Autowired private IDALTable		tableDAL;
										
										
	/**
	 * 
	 */
	public TableServiceImpl() {}
	
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
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJTable t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJTable t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJTable > queryEq( GJTable t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.middle.backend.db.IDatabaseSVR#dbs()
	 */
	@Override
	public List< GJTable > tables() {
		
		return tableDAL.tables();
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.backend.table.ITableService#newTable(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	@Transactional
	public Map< String, Object > newTable( String token, String table, String columns, String url_suffix, String comment ) {
		
		Map< String, Object > map = tokenService.validToken( token );
		if ( map.containsKey( "uid" ) ) {
			
			int uid = Integer.parseInt( map.get( "uid" ).toString() );
			
			String db = String.format( FMT_DB_NAME, uid );
			
			databaseService.newDB( db );
			
			tableDAL.newTable( db + ".", table, columns, comment );
			
			GJJsonLink link = new GJJsonLink();
			link.setUid( uid );
			link.setSuffix( url_suffix );
			link.setTarget( table );
			link.setType( 100 );
			jsonLinkService.insert( link );
			
			map.clear();
			map.put( JSON_KEY, 1 );
		}
		return map;
	}
	
}
