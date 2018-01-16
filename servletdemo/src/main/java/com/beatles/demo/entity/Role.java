package com.beatles.demo.entity;

import com.beatles.demo.entity.base.BaseEntity;

/**
 * role Entity
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:40:29
 */
public class Role extends BaseEntity {
	private String roleName;
	private String powers;
	private String roleDesc;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getPowers() {
		return powers;
	}

	public void setPowers(String powers) {
		this.powers = powers;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

}
