package com.beatles.demo.biz;

import java.util.List;

import com.beatles.demo.entity.Resources;
import com.beatles.page.Tree;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午11:29:09
 */
public interface IResourcesBiz {
	List<Resources> treeGrid();
	
	boolean add(Resources t);
	
	boolean update(Resources t);
	
	boolean delete(int id);
	
	boolean delete(String ids);
	
	Resources getResourcesById(int id);
	
	List<Resources> getResourcesByPid(int pid);
	
	List<Tree> tree();
	
	
}
