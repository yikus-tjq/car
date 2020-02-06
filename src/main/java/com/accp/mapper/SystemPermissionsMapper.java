package com.accp.mapper;

import com.accp.domain.SystemPermissions;
import com.accp.domain.SystemPermissionsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemPermissionsMapper {
    int countByExample(SystemPermissionsExample example);

    int deleteByExample(SystemPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SystemPermissions record);

    int insertSelective(SystemPermissions record);

    List<SystemPermissions> selectByExample(SystemPermissionsExample example);

    SystemPermissions selectByPrimaryKey(Integer id);

    List<SystemPermissions> selectUserMenuAll(Integer type,Integer uid);

    int updateByExampleSelective(@Param("record") SystemPermissions record, @Param("example") SystemPermissionsExample example);

    int updateByExample(@Param("record") SystemPermissions record, @Param("example") SystemPermissionsExample example);

    int updateByPrimaryKeySelective(SystemPermissions record);

    int updateByPrimaryKey(SystemPermissions record);
}