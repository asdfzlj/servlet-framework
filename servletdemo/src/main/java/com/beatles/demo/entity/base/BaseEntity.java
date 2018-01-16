package com.beatles.demo.entity.base;
/**
 * 主键
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:35:48
 */

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
