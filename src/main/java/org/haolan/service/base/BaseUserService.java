package org.haolan.service.base;

import java.util.List;

import org.haolan.bean.base.BaseUser;
import com.baomidou.framework.service.ISuperService;
import com.baomidou.mybatisplus.plugins.Page;

/**
 *
 * BaseUser 表数据服务层接口
 *
 */
public interface BaseUserService extends ISuperService<BaseUser> {

	List<BaseUser> selectAll();

	Page<BaseUser> selectPageUser();


}