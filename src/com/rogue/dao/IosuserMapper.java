package com.rogue.dao;

import com.rogue.entity.Iosuser;
import com.rogue.entity.IosuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IosuserMapper {
    int countByExample(IosuserExample example);

    int deleteByExample(IosuserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Iosuser record);

    int insertSelective(Iosuser record);

    List<Iosuser> selectByExample(IosuserExample example);

    Iosuser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Iosuser record, @Param("example") IosuserExample example);

    int updateByExample(@Param("record") Iosuser record, @Param("example") IosuserExample example);

    int updateByPrimaryKeySelective(Iosuser record);

    int updateByPrimaryKey(Iosuser record);
}