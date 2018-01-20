package com.beatles.biz.test;
/**
 * @author zhang lj
 * @createTime 2018年1月21日 上午1:21:17
 */

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.beatles.demo.biz.IResourcesBiz;
import com.beatles.demo.biz.impl.ResourcesBizImpl;
import com.beatles.utils.FastJSONUtils;

public class ResourcesBizTest {
	IResourcesBiz resourcesBiz;

	@Before
	public void beforeClass() {
		resourcesBiz=new ResourcesBizImpl();
	}
	@Test
	public void testTreeGrid() {
		System.out.println(FastJSONUtils.toJsonString(resourcesBiz.treeGrid()));
		
	}
}
