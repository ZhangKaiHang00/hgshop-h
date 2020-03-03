package com.zkh.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.zkh.hgshop.service.UserService;
/**
 * 
    * @ClassName: UserServiceImpl
    * @Description: TODO
    * @author 张凯航
    * @date 2020年3月3日
    *
 */
@Service(interfaceClass = UserService.class,version = "1.0.0")
public class UserServiceImpl implements UserService{

	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return "admin".equals(userName) && "123456".equals(passWord);
	}

}
