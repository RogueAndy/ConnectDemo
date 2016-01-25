package com.rogue.service;

import java.util.List;

import com.rogue.entity.Iosuser;
import com.rogue.entity.IosuserExample;

public interface IosuserService {

	public Iosuser getIosuserByID(String userid);
	
	public int deleteIosuserByID(String userid);
	
	public int insertIosuser(Iosuser user);
	
	List<Iosuser> selectByExample(IosuserExample example);
	
}
