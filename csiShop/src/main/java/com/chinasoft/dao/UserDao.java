package com.chinasoft.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.entity.User;

public interface UserDao {

	int deleteByPrimaryKey(Integer user_id);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer user_id);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);

    User login(@Param("username") String username,@Param("password") String password);

    Integer checkUsername(String username);

    Integer checkUserEmail(String email);

    User selectUserByUsernameAndPassword(@Param("username")String username,@Param("password")String password);

    User selectAdminUser(@Param("username")String username,@Param("password")String password,@Param("enable_status") Integer enable_status);

    List<User> selectAllUser();

    Integer countUser();
	
	
}