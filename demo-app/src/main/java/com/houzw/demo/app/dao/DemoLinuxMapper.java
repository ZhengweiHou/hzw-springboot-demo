package com.houzw.demo.app.dao;

import com.houzw.demo.app.entity.DemoLinux;
import com.houzw.demo.app.entity.DemoLinuxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoLinuxMapper {
    long countByExample(DemoLinuxExample example);

    int deleteByExample(DemoLinuxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DemoLinux record);

    int insertSelective(DemoLinux record);

    List<DemoLinux> selectByExample(DemoLinuxExample example);

    DemoLinux selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DemoLinux record, @Param("example") DemoLinuxExample example);

    int updateByExample(@Param("record") DemoLinux record, @Param("example") DemoLinuxExample example);

    int updateByPrimaryKeySelective(DemoLinux record);

    int updateByPrimaryKey(DemoLinux record);
}