package org.haolan.serviceImpl.base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.haolan.dao.base.BaseUserMapper;

import java.util.List;

import org.haolan.bean.base.BaseUser;
import org.haolan.service.base.BaseUserService;
import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.baomidou.mybatisplus.plugins.Page;

/**
 *
 * BaseUser 表数据服务层接口实现类
 *
 */
@Service
public class BaseUserServiceImpl extends SuperServiceImpl<BaseUserMapper, BaseUser> implements BaseUserService {
	@Autowired
	private BaseUserMapper userMapper;
	@Override
	public List<BaseUser> selectAll() {
	return 	this.userMapper.queryAll();
	}
	
	@Override
	public Page<BaseUser> selectPageUser() {
		Page<BaseUser> page  = new Page<BaseUser>();
		page.setRecords(this.userMapper.selectPageUser());
		return page;
	}


}