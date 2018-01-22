package com.beatles;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import com.beatles.demo.entity.Resources;
import com.beatles.demo.view.ResourcesDTO;

/**
 * @author zhang lj
 * @createTime 2018年1月22日 下午10:23:28
 */
public class BeanCopyTest {
	public static void main(String[] args) {
		ResourcesDTO dto = new ResourcesDTO();
		dto.setIcon("icon");
		dto.setId(1);
		dto.setPid(0);
		dto.setPname("菜单配置");
		dto.setSeq(1);
		dto.setState(1);
		dto.setTitle("菜单父类");
		dto.setUrl("/menu");
		
		Resources t=new Resources();
		
		try {
			BeanUtils.copyProperties(dto, t);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t);
	}
}
