/**
 * 
 */
package com.iam_vip.generate_json.zz.backend.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iam_vip.generate_json.dal.backend.IDALJsonLink;


/**
 * @author Colin
 */
@Service
public class JsonLinkServiceImpl implements IJsonLinkService {
	
	@Autowired private IDALJsonLink jsonLinkDAL;
	
	
	/**
	 * 
	 */
	public JsonLinkServiceImpl() {}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#insert(java.lang.Object)
	 */
	@Override
	public int insert( GJJsonLink t ) {
		
		return jsonLinkDAL.insert( t );
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#inserts(java.util.List)
	 */
	@Override
	public int inserts( List< GJJsonLink > list ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#delete(java.lang.Object)
	 */
	@Override
	public int delete( Object primaryKeyVal ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#update(java.lang.Object)
	 */
	@Override
	public int update( GJJsonLink t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryOne(java.lang.Object)
	 */
	@Override
	public GJJsonLink queryOne( Object primaryKeyVal ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCount(java.lang.Object)
	 */
	@Override
	public long queryCount( GJJsonLink t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryCountEq(java.lang.Object)
	 */
	@Override
	public long queryCountEq( GJJsonLink t ) {
		
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#query(java.lang.Object)
	 */
	@Override
	public List< GJJsonLink > query( GJJsonLink t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.IGeneral#queryEq(java.lang.Object)
	 */
	@Override
	public List< GJJsonLink > queryEq( GJJsonLink t ) {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	/* (non-Javadoc)
	 * @see com.iam_vip.generate_json.zz.backend.table.IJsonLinkService#queryOneBySuffix(int, java.lang.String)
	 */
	@Override
	public GJJsonLink queryOneBySuffix( int uid, String suffix ) {
		
		return jsonLinkDAL.queryOneBySuffix( uid, suffix );
	}
	
}
