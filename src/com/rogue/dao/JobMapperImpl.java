package com.rogue.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.rogue.entity.Job;
import com.rogue.entity.JobExample;

@Repository("jobMapper")
public class JobMapperImpl extends SqlSessionDaoSupport implements JobMapper {

	@Resource 
	private SqlSessionFactory sqlSessionFactory; 
	
	@Override
	public int deleteByPrimaryKey(String jobid) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		int bool = mapper.deleteByPrimaryKey(jobid);
		
		return bool;
	}

	@Override
	public int insert(Job record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		int bool = mapper.insert(record);
		
		return bool;
	}

	@Override
	public int insertSelective(Job record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		int bool = mapper.insertSelective(record);
		
		return bool;
	}

	@Override
	public Job selectByPrimaryKey(String jobid) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		Job job = mapper.selectByPrimaryKey(jobid);
		
		return job;
	}

	@Override
	public int updateByPrimaryKeySelective(Job record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		int bool = mapper.updateByPrimaryKeySelective(record);
		
		return bool;
		
	}

	@Override
	public int updateByPrimaryKey(Job record) {
		
		SqlSession session = sqlSessionFactory.openSession();
		JobMapper mapper = session.getMapper(JobMapper.class);
		int bool = mapper.updateByPrimaryKey(record);
		
		return bool;
		
	}

	@Override
	public int countByExample(JobExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(JobExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Job> selectByExample(JobExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Job record, JobExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Job record, JobExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
