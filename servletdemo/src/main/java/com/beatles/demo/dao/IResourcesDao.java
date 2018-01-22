package com.beatles.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beatles.demo.entity.Resources;
import com.beatles.demo.view.ResourcesDTO;
import com.beatles.utils.DBUtil;

/**
 * @author zhang lj
 * @createTime 2018年1月16日 上午9:46:22
 */
public interface IResourcesDao {
	DBUtil util = new DBUtil();

	List<Resources> getResourcesViewList();

	boolean save(Resources t);
	
	boolean delete(int id);

	boolean delete(String ids);

	boolean update(Resources t);

	default List<Resources> _resultList1(ResultSet rs) {
		List<Resources> _list = new ArrayList<Resources>();
		try {
			while (rs.next()) {
				Resources dto = new Resources();
				dto.setIcon(rs.getString("icon"));
				dto.setId(rs.getInt("id"));
				dto.setPid(rs.getInt("pid"));
				dto.setSeq(rs.getInt("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setUrl(rs.getString("url"));
				_list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.release();
		}
		return _list;
	}

	default List<ResourcesDTO> _resultList(ResultSet rs) {
		List<ResourcesDTO> _list = new ArrayList<ResourcesDTO>();
		try {
			while (rs.next()) {
				ResourcesDTO dto = new ResourcesDTO();
				dto.setIcon(rs.getString("icon"));
				dto.setId(rs.getInt("id"));
				dto.setPid(rs.getInt("pid"));
				dto.setPname(rs.getString("ptitle"));
				dto.setSeq(rs.getInt("seq"));
				dto.setState(rs.getInt("state"));
				dto.setTitle(rs.getString("title"));
				dto.setUrl(rs.getString("url"));
				_list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			util.release();
		}
		return _list;
	}
}
