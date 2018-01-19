package com.beatles.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午10:10:22
 */
public class SessionInfo implements Serializable {
	private int id;
	private String loginName;
	private String name;
	private String ip;
	
	private List<String> resourceList;//用户访问的资源列表

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public List<String> getResourceList() {
		return resourceList;
	}

	public void setResourceList(List<String> resourceList) {
		this.resourceList = resourceList;
	}
	
	
}
