package com.zkh.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zkh.hgshop.config.AdminProperties;
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

	//得到管理员的信息
	@Autowired
	AdminProperties adminPro;
	
	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		//判断用户和密码是否与配置文件一致
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
	}

}
