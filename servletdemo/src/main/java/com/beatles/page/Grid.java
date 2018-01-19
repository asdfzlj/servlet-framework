package com.beatles.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午10:12:32
 */
public class Grid implements Serializable {
	private Long total=0l;
	private List rows=new ArrayList();
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
	
	
}
