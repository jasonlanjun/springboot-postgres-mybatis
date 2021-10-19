package com.junlan.mapper;

import com.junlan.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUser();

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(String name);

}
