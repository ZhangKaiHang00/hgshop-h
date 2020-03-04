package com.zkh.hgshop.service;

import com.github.pagehelper.PageInfo;
import com.zkh.hgshop.pojo.Spec;

public interface SpecService {

	PageInfo<Spec> list(String name,int page);
	
	int add(Spec spec);
	
	int update(Spec spec);
	
	int delete(int id);
	/**
	 * 
	    * @Title: findById
	    * @Description: 查找一个规格 用于修改时候的回显
	    * @param @param id
	    * @param @return   
	    * @return Spec    
	    * @throws
	 */
	Spec findById(int id);
	/**
	 * 
	    * @Title: deleteBatch
	    * @Description: 批量删除
	    * @param @param id
	    * @param @return   
	    * @return int    
	    * @throws
	 */
	int deleteBatch(int[] id);
}
