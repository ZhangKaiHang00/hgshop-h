package com.zkh.hgshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
    * @ClassName: BrandController
    * @Description: 品牌管理
    * @author 张凯航
    * @date 2020年3月4日
    *
 */
@Controller
@RequestMapping("brand")
public class BrandController {

	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1") int page) {
		return "brand/list";
	}

}
