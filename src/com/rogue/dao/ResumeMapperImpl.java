package com.rogue.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.rogue.entity.Resume;
import com.rogue.entity.ResumeExample;

@Repository("resumeMapper")
public class ResumeMapperImpl extends SqlSessionDaoSupport implements ResumeMapper {

	@Resource 
	private SqlSessionFactory sqlSessionFactory; 
	
	@Override
	public int deleteByPrimaryKey(String resumeid) {

		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		int bool = mapper.deleteByPrimaryKey(resumeid);
		
		return bool;
		
	}

	@Override
	public int insert(Resume record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		int bool = mapper.insert(record);
		
		return bool;
		
	}

	@Override
	public int insertSelective(Resume record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		int bool = mapper.insertSelective(record);
		
		return bool;
		
	}

	@Override
	public Resume selectByPrimaryKey(String resumeid) {
		
		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		Resume resume = mapper.selectByPrimaryKey(resumeid);
		
		return resume;
		
	}

	@Override
	public int updateByPrimaryKeySelective(Resume record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		int bool = mapper.updateByPrimaryKeySelective(record);
		
		return bool;
		
	}

	@Override
	public int updateByPrimaryKey(Resume record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		ResumeMapper mapper = session.getMapper(ResumeMapper.class);
		int bool = mapper.updateByPrimaryKey(record);
		
		return bool;
		
	}

	@Override
	public int countByExample(ResumeExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ResumeExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Resume> selectByExample(ResumeExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Resume record, ResumeExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Resume record, ResumeExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
