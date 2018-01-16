package com.beatles.demo.entity;

import com.beatles.demo.entity.base.BaseEntity;

/**
 * dept entity
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:39:06
 */
public class Dept extends BaseEntity {
	private String deptName;
	private String deptDesc;
	private int pid;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
}
