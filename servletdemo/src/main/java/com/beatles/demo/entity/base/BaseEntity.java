package com.beatles.demo.entity.base;
/**
 * 主键
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:35:48
 */

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private int id;
	private int seq; //排序号
	private int state; //状态
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
}
