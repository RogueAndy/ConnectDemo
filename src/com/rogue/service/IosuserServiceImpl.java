package com.rogue.service;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rogue.dao.IosuserMapper;
import com.rogue.entity.Iosuser;
import com.rogue.entity.IosuserExample;
import com.rogue.entity.IosuserExample.Criteria;
import com.rogue.service.IosuserService;

@Service("iosuserService")
public class IosuserServiceImpl implements IosuserService {

	@Resource
	private IosuserMapper iosuserMapper;

	@Override
	public Iosuser getIosuserByID(String userid) {
			
		return iosuserMapper.selectByPrimaryKey(userid);
	}

	@Override
	public int deleteIosuserByID(String userid) {
		
		return iosuserMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int insertIosuser(Iosuser user) {
		
		return iosuserMapper.insert(user);
	}

	@Override
	public List<Iosuser> selectByExample(IosuserExample example) {
		
		return iosuserMapper.selectByExample(example);
	}

	
}
