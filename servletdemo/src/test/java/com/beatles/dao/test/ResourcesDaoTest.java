package com.beatles.dao.test;

import org.junit.Test;

import com.beatles.demo.dao.IResourcesDao;
import com.beatles.demo.dao.impl.ResourcesDaoImpl;
import com.beatles.utils.FastJSONUtils;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午11:36:21
 */
public class ResourcesDaoTest {
	IResourcesDao dao=new ResourcesDaoImpl();
	@Test
	public void getResourcesViewListTest() {
		
		String json=FastJSONUtils.toJsonString(dao.findAllObjects());
		System.out.println(json);
	}
}
