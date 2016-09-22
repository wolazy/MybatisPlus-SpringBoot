package org.haolan.controller.base;

import java.util.List;

import org.haolan.bean.base.BaseUser;
import org.haolan.service.base.BaseUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;

@RestController
@RequestMapping("/base")
public class BaseUserController {
	@Autowired
	private BaseUserService userService;
	/**
	 *	自定义sql 
	 */
	@RequestMapping("/test")
	public  List<BaseUser> test(){
		return this.userService.selectAll();
	}
	/**
	 * mybatis-plus sql
	 * @return
	 */
	@RequestMapping("/test1")
	public BaseUser test1(){
		return this.userService.selectById(1L);
	}
	
	/**
	 * 分页
	 */
	@RequestMapping("/test2")
	public Page<BaseUser> selectPageUser(){
		return this.userService.selectPageUser();
	}
}
