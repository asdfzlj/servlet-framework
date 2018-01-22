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
public class ResourcesBizImpl implements IResourcesBiz {
	private IResourcesDao resourcesDao;

	public ResourcesBizImpl() {
		resourcesDao = new ResourcesDaoImpl();
	}

	@Override
	public List<Resources> treeGrid() {
		return resourcesDao.findAllObjects();
	}

	@Override
	public boolean add(Resources t) {
		return resourcesDao.save(t);
	}

	@Override
	public boolean update(Resources t) {
		return resourcesDao.update(t);
	}

	@Override
	public boolean delete(int id) {
		return resourcesDao.delete(id);
	}

	@Override
	public boolean delete(String ids) {
		return resourcesDao.delete(ids);
	}

	@Override
	public Resources getResourcesById(int id) {
		return resourcesDao.findObjectById(id);
	}

	@Override
	public List<Resources> getResourcesByPid(int pid) {
		return resourcesDao.findObjectsByPid(pid);
	}

}
