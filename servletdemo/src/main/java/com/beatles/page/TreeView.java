package com.beatles.page;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhang lj
 * @createTime 2018年1月25日 下午4:26:17
 */
public class TreeView implements Serializable {
	private long id;
	private String text;
	private List<TreeView> nodes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<TreeView> getNodes() {
		return nodes;
	}

	public void setNodes(List<TreeView> nodes) {
		this.nodes = nodes;
	}

}
