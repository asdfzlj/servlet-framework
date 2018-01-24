package com.beatles.demo.dao;
/**
 * @author zhang lj
 * @createTime 2018年1月24日 下午11:38:25
 */
public interface IBaseDao<T> {
	boolean save(T t);
	boolean delete(int id);
	boolean update(T t);
	public T get(int id);
	
}
