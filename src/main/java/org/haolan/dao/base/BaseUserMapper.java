package org.haolan.dao.base;

import java.util.List;

import org.haolan.bean.base.BaseUser;
import com.baomidou.mybatisplus.mapper.AutoMapper;

/**
 *
 * BaseUser 表数据库控制层接口
 *
 */
public interface BaseUserMapper extends AutoMapper<BaseUser> {

	List<BaseUser> queryAll();

	List<BaseUser> selectPageUser();


}