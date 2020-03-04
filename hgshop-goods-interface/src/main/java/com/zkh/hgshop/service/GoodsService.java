package com.zkh.hgshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zkh.hgshop.pojo.Brand;
import com.zkh.hgshop.pojo.Category;
/**
 * 
    * @ClassName: GoodsService
    * @Description: **** Dubbo 服务接口函数比要有非Void 的返回值********
    * @author 张凯航
    * @date 2020年3月3日
    *
 */
public interface GoodsService {

	int addBrand(Brand brand);
	int updateBrand(Brand brand);
	int deleteBrand(Integer id);
	
	/**
	 * 
	    * @Title: listBrand
	    * @Description: 分页
	    * @param @param firstChar
	    * @param @param page
	    * @param @return   
	    * @return PageInfo<Brand>    
	    * @throws
	 */
	PageInfo<Brand> listBrand( String firstChar,int page);
	
	int addCategory(Category category);
	int updateCategory(Category category);
	int deleteCategory(Integer id);
	
	/**
	 * 
	    * @Title: listCategory
	    * @Description: 分页
	    * @param @param firstChar
	    * @param @param page
	    * @param @return   
	    * @return PageInfo<Category>    
	    * @throws
	 */
	PageInfo<Category> listCategory( String firstChar,int page); 
	
	/**
	 * 
	    * @Title: treeCategory
	    * @Description: 以树形显示列表
	    * @param @return   
	    * @return List<Category>    
	    * @throws
	 */
	List<Category> treeCategory(); 
}
