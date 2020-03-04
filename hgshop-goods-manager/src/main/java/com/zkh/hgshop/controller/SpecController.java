package com.zkh.hgshop.controller;

import java.util.function.Predicate;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zkh.hgshop.pojo.Spec;
import com.zkh.hgshop.pojo.SpecOption;
import com.zkh.hgshop.service.SpecService;

/**
 * 
    * @ClassName: SpecController
    * @Description: 规格管理
    * @author 张凯航
    * @date 2020年3月4日
    *
 */
@Controller
@RequestMapping("spec")
public class SpecController {

	@Reference
	SpecService specService;
	
	/**
	 * 
	    * @Title: list
	    * @Description: 进入规划的列表
	    * @param @param request
	    * @param @param page
	    * @param @param name
	    * @param @return   
	    * @return String    
	    * @throws
	 */
	@RequestMapping("list")
	public String list(HttpServletRequest request,
			@RequestParam(defaultValue="1") int page,
			@RequestParam(defaultValue="") String name
	) {
		 PageInfo<Spec> pageInfo = specService.list(name, page);
		 request.setAttribute("pageInfo", pageInfo);
		return "spec/list";
	}
	
	/**
	 * 
	    * @Title: add
	    * @Description: 添加
	    * @param @param request
	    * @param @param spec
	    * @param @return   
	    * @return String    
	    * @throws
	 */
	@RequestMapping("add")
	@ResponseBody
	public String add(HttpServletRequest request,Spec spec ) {
		
		//System.out.println("spec" + spec);
		//System.out.println();
		spec.getOptions().removeIf(new Predicate<SpecOption>() {
			public boolean test(SpecOption x) {return x.getOptionName()==null;}
		});
		//System.out.println("spec 处理后：" + spec);
		//调用服务
		int add = specService.add(spec);
		return add>0?"success":"false";
	}
}
