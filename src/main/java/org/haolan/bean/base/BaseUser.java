package org.haolan.bean.base;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 用户信息
 *
 */
@TableName("b_base_user")
public class BaseUser implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 用户内部编号 */
	@TableId(type = IdType.AUTO)
	private Long userId;

	/** 用户昵称 */
	private String userName;

	/** 用户名 */
	private String loginName;

	/** 备注 */
	private String userRemark;

	/** 邮箱 */
	private String userEmail;

	/** 头像 */
	private String userPhoto;

	/** 密码 */
	private String password;

	/** 手机号 */
	private String userMobile;

	/** 创建时间 */
	private Date createDate;

	/** 更新时间 */
	private Date updateDate;

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserRemark() {
		return this.userRemark;
	}

	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
