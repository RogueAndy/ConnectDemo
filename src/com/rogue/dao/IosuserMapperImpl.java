package com.rogue.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.rogue.entity.Iosuser;
import com.rogue.entity.IosuserExample;

@Repository("iosuserMapper")
public class IosuserMapperImpl extends SqlSessionDaoSupport implements IosuserMapper {

	@Resource 
	private SqlSessionFactory sqlSessionFactory;  
	
	@Override
	public int deleteByPrimaryKey(String userid) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);
		int bool = mapper.deleteByPrimaryKey(userid);
		
		return bool;
	}

	@Override
	public int insert(Iosuser record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);
		int bool = mapper.insert(record);
		
		return bool;
	}

	@Override
	public int insertSelective(Iosuser record) {
	
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);   
		int bool = mapper.insertSelective(record); 
        session.close();
		return bool;
	}

	@Override
	public Iosuser selectByPrimaryKey(String userid) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);   
		Iosuser user = mapper.selectByPrimaryKey(userid); 
        session.close();
		return user;
		
	}

	@Override
	public int updateByPrimaryKeySelective(Iosuser record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);   
		int bool = mapper.updateByPrimaryKeySelective(record); 
        session.close();
		return bool;
		
	}

	@Override
	public int updateByPrimaryKey(Iosuser record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);   
		int bool = mapper.updateByPrimaryKey(record);
        session.close();
		return bool;
	}

	@Override
	public int countByExample(IosuserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(IosuserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Iosuser> selectByExample(IosuserExample example) {
		
		SqlSession session = sqlSessionFactory.openSession();
		IosuserMapper mapper = session.getMapper(IosuserMapper.class);   
		List<Iosuser> users = mapper.selectByExample(example);
        session.close();
		return users;
	}

	@Override
	public int updateByExampleSelective(Iosuser record, IosuserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Iosuser record, IosuserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
