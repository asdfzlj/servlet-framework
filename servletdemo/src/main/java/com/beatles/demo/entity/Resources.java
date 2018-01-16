package com.beatles.demo.entity;

import com.beatles.demo.entity.base.BaseEntity;

/**
 * Resources Entity
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:41:59
 */
public class Resources extends BaseEntity {
	private String title;
	private String url;
	private String icon;
	private int pid;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

}
