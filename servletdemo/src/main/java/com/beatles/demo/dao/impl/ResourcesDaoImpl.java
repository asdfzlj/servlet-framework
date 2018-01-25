package com.beatles.demo.dao.impl;

import java.util.List;

import com.beatles.demo.dao.IResourcesDao;
import com.beatles.demo.entity.Resources;
import com.beatles.demo.view.ResourcesDTO;
import com.beatles.utils.LogUtil;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午11:22:08
 */
public class ResourcesDaoImpl implements IResourcesDao {

	@Override
	public List<Resources> findAllObjects() {
		String sql = "select * from sys_res order by seq";
		return _resultListEntity(util.query(sql));
	}

	@Override
	public boolean save(Resources t) {
		String sql = "insert into sys_res(title,url,icon,pid,seq) values(?,?,?,?,?)";
		Object[] params = { t.getTitle(), t.getUrl(), t.getIcon(), t.getPid(), t.getSeq() };
		return util.update(sql, params) == 1;
	}

	@Override
	public boolean delete(int id) {
		String sql = "delete from sys_res where id=?";
		Object[] params = { id };
		return util.update(sql, params) == 1;
	}

	@Override
	public boolean delete(String ids) {
		String sql = "delte from sys_res where id in(" + ids + ")";
		return util.update(sql) >= 1;
	}

	@Override
	public boolean update(Resources t) {
		String sql = "update sys_res set title=?,url=?,icon=?,pid=?,seq=? where id=?";
		Object[] params = { t.getTitle(), t.getUrl(), t.getIcon(), t.getPid(), t.getSeq(), t.getId() };
		return util.update(sql, params) == 1;
	}

	@Override
	public Resources findObjectById(int id) {
		String sql = "select * from sys_res where id=?";
		return _resultListEntity(util.query(sql, id)).get(0);
	}

	@Override
	public List<Resources> findObjectsByPid(int pid) {
		String sql = "select * from sys_res where pid=?";
		LogUtil.info(sql);
		return _resultListEntity(util.query(sql, pid));
	}

}
