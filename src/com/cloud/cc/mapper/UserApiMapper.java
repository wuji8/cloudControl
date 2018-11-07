package com.cloud.cc.mapper;

import java.util.List;

import com.cloud.cc.vo.UserApi;

public interface UserApiMapper {
    int deleteByPrimaryKey(Integer apiid);

    int insert(UserApi record);

    int insertSelective(UserApi record);

    UserApi selectByPrimaryKey(Integer apiid);

    int updateByPrimaryKeySelective(UserApi record);

    int updateByPrimaryKey(UserApi record);
    
    List<UserApi> selectByTableId(Integer tableId);
}