package com.zkh.hgshop.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zkh.hgshop.service.UserService;

/**
 * 
    * @ClassName: UserController
    * @Description: 登入
    * @author 张凯航
    * @date 2020年3月3日
    *
 */
@Controller
public class UserController {

	@Reference(timeout = 2000,version = "1.0.0")
	UserService userService;
	
	@RequestMapping("tologin")
	public String toLogin() {
		return "login";
	}
	
	@RequestMapping("login")
	public String login(String name,String password) {
		
		System.out.println("name "+name+" password "+password);
		
		if (userService.login(name, password)) {
			return "redirect:/";
		}else {
			return "login";
		}
	}
	
}
