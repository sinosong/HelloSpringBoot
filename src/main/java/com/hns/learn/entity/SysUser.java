
package com.hns.learn.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * <p>
 * 用户管理
 * </p>
 *
 * @author ShenHuaJie
 * @since 2017-02-15
 */
@TableName("sys_user")
@SuppressWarnings("serial")
public class SysUser extends BaseModel {

	/**
	 * 登陆帐户
	 */
	@TableField("account_")
	private String account;
	/**
	 * 密码
	 */
	@TableField("password_")
	private String password;
	/**
	 * 用户类型(1普通用户2管理员3系统用户)
	 */
	@TableField("user_type")
	private String userType;
	/**
	 * 姓名
	 */
	@TableField("user_name")
	private String userName;
	/**
	 * 性别(0:未知;1:男;2:女)
	 */
	@TableField("sex_")
	private Integer sex;
	/**
	 * 头像
	 */
	@TableField("avatar_")
	private String avatar;
	/**
	 * 电话
	 */
	@TableField("phone_")
	private String phone;
	/**
	 * 手机号
	 */
	@TableField("telephone_")
	private String telephone;
	/**
	 * 用户级别
	 */
	@TableField("user_level")
	private String userLevel;

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	/**
	 * 邮箱
	 */
	@TableField("email_")
	private String email;
	/**
	 * 证件类型
	 */
	@TableField("ID_TYPE")
	private String idType;
	/**
	 * 身份证号码
	 */
	@TableField("id_card")
	private String idCard;
	/**
	 * 部门编码
	 */
	@TableField("DEPT_CODE")
	private String deptCode;
	/**
	 * 组织机构
	 */
	@TableField("ORG_CODE")
	private String orgCode;
	/**
	 * 详细地址
	 */
	@TableField("address_")
	private String address;
	/**
	 * 工号
	 */
	@TableField("staff_no")
	private String staffNo;

	/**
	 * 是否修改密码
	 */
	@TableField(exist = false)
	private String openpwd;
	

	/**
	 * 身份证号码
	 */
	@TableField("BIRTH_DAY")
	private String birthDay;
	/**
	 * 是否接收到授权工作（1是0否)
	 */
	@TableField("CHANGE_WORK")
	private Integer changeWork;

	@TableField(exist = false)
	private String oldPassword;

	@TableField(exist = false)
	private String deptName;

	@TableField(exist = false)
	private String userTypeText;

	@TableField(exist = false)
	private String permission;
    /**
     * 非数据库字段,岗位编码字符串
     */
	@TableField(exist = false)
	private String roles;

    /**
     * 加密密码的盐
     */
	@TableField(exist = false)
	private String salt = "HelloWorld";

    /**
     * 担保推送状态(1有效；0无效)
     */
    @TableField("GMS_STATE")
    private Integer gmsState;

    public SysUser() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public String getOpenpwd() {
        return openpwd;
    }

    public void setOpenpwd(String openpwd) {
        this.openpwd = openpwd;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getChangeWork() {
        return changeWork;
    }

    public void setChangeWork(Integer changeWork) {
        this.changeWork = changeWork;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUserTypeText() {
        return userTypeText;
    }

    public void setUserTypeText(String userTypeText) {
        this.userTypeText = userTypeText;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getGmsState() {
        return gmsState;
    }

    public void setGmsState(Integer gmsState) {
        this.gmsState = gmsState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SysUser)) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equal(getAccount(), sysUser.getAccount()) &&
                Objects.equal(getPassword(), sysUser.getPassword()) &&
                Objects.equal(getUserType(), sysUser.getUserType()) &&
                Objects.equal(getUserName(), sysUser.getUserName()) &&
                Objects.equal(getSex(), sysUser.getSex()) &&
                Objects.equal(getAvatar(), sysUser.getAvatar()) &&
                Objects.equal(getPhone(), sysUser.getPhone()) &&
                Objects.equal(getTelephone(), sysUser.getTelephone()) &&
                Objects.equal(getUserLevel(), sysUser.getUserLevel()) &&
                Objects.equal(getEmail(), sysUser.getEmail()) &&
                Objects.equal(getIdType(), sysUser.getIdType()) &&
                Objects.equal(getIdCard(), sysUser.getIdCard()) &&
                Objects.equal(getDeptCode(), sysUser.getDeptCode()) &&
                Objects.equal(getOrgCode(), sysUser.getOrgCode()) &&
                Objects.equal(getAddress(), sysUser.getAddress()) &&
                Objects.equal(getStaffNo(), sysUser.getStaffNo()) &&
                Objects.equal(getOpenpwd(), sysUser.getOpenpwd()) &&
                Objects.equal(getBirthDay(), sysUser.getBirthDay()) &&
                Objects.equal(getChangeWork(), sysUser.getChangeWork()) &&
                Objects.equal(getOldPassword(), sysUser.getOldPassword()) &&
                Objects.equal(getDeptName(), sysUser.getDeptName()) &&
                Objects.equal(getUserTypeText(), sysUser.getUserTypeText()) &&
                Objects.equal(getPermission(), sysUser.getPermission()) &&
                Objects.equal(getRoles(), sysUser.getRoles()) &&
                Objects.equal(getSalt(), sysUser.getSalt()) &&
                Objects.equal(getGmsState(), sysUser.getGmsState());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getAccount(), getPassword(), getUserType(), getUserName(), getSex(), getAvatar(), getPhone(), getTelephone(), getUserLevel(), getEmail(), getIdType(), getIdCard(), getDeptCode(), getOrgCode(), getAddress(), getStaffNo(), getOpenpwd(), getBirthDay(), getChangeWork(), getOldPassword(), getDeptName(), getUserTypeText(), getPermission(), getRoles(), getSalt(), getGmsState());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("account", account)
                .add("password", password)
                .add("userType", userType)
                .add("userName", userName)
                .add("sex", sex)
                .add("avatar", avatar)
                .add("phone", phone)
                .add("telephone", telephone)
                .add("userLevel", userLevel)
                .add("email", email)
                .add("idType", idType)
                .add("idCard", idCard)
                .add("deptCode", deptCode)
                .add("orgCode", orgCode)
                .add("address", address)
                .add("staffNo", staffNo)
                .add("openpwd", openpwd)
                .add("birthDay", birthDay)
                .add("changeWork", changeWork)
                .add("oldPassword", oldPassword)
                .add("deptName", deptName)
                .add("userTypeText", userTypeText)
                .add("permission", permission)
                .add("roles", roles)
                .add("salt", salt)
                .add("gmsState", gmsState)
                .toString();
    }
}