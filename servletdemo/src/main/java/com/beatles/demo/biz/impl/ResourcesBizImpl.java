package com.beatles.demo.biz.impl;

import java.util.List;

import com.beatles.demo.biz.IResourcesBiz;
import com.beatles.demo.dao.IResourcesDao;
import com.beatles.demo.dao.impl.ResourcesDaoImpl;
import com.beatles.demo.entity.Resources;

/**
 * @author zhang lj
 * @createTime 2018年1月20日 下午10:07:23
 */
public class ResourcesBizImpl implements IResourcesBiz{
	private IResourcesDao resourcesDao;
	public ResourcesBizImpl() {
		resourcesDao=new ResourcesDaoImpl();
	}
	@Override
	public List<Resources> treeGrid() {
		// TODO Auto-generated method stub
		return resourcesDao.getResourcesViewList();
	}

}
