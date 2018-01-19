package com.beatles.page;

import java.io.Serializable;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午10:14:25
 */
public class PageFilter implements Serializable {
	private int page;//当前页
	private int rows;//每页显示记录数
	private String sort;//排序字段
	private String order; //asc/desc
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	
	
}
