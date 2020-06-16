package com.chinasoft.service.impl;

<<<<<<< HEAD
import com.chinasoft.entity.User;
=======
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserDao;
import com.chinasoft.entity.*;
>>>>>>> fa2ea7ab7b3899a66c44b8b997afa922be2d8913
import com.chinasoft.service.UserService;
import com.chinasoft.util.SessionUtil;

@Service
public class UserServiceImpl implements UserService {
	
	
	public SqlSessionFactory factory = SessionUtil.getSession();
   
	// 登录
		public User login(String name) {
			SqlSession sqlSession = null;
			sqlSession = factory.openSession();
			User user = sqlSession.getMapper(UserDao.class).login(name);
			sqlSession.close();
			return user;
		}
	

	@Override
	public User login(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
