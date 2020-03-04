package com.zkh.hgshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
    * @ClassName: IndexController
    * @Description: TODO
    * @author 张凯航
    * @date 2020年3月3日
    *
 */
@Controller
public class IndexController {

	@RequestMapping({"/","index"})
	public String index(){
	
		return "index";
	}
}
