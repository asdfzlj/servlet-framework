package com.beatles.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * 鏁版嵁搴撹繛鎺ヨ緟鍔╃被
 * @author zhang lj
 * @createTime 2018骞�1鏈�19鏃� 涓婂崍11:14:46
 */
public final class DBUtil {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/db_servlet";
	private final String USERNAME = "root";

	private final String USERPWD = "root";
	
	private Connection conn = null;
	private Statement st = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private static  DataSource source=null;
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public DBUtil() {
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, USERPWD);
	}
	/*public Connection getConnection(){
		try {
			conn=source.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}*/

	
	public ResultSet query(String sql, Object... obj) { // Object[] obj
		try {
			conn = getConnection();
			pst = conn.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					pst.setObject(i + 1, obj[i]);
				}
			}
			rs = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	public int update(String sql, Object... obj) {
		int returnValue = 0;
		try {
			conn = getConnection();
			pst = conn.prepareStatement(sql);
			if (obj != null) {
				for (int i = 0; i < obj.length; i++) {
					pst.setObject(i + 1, obj[i]);
				}
			}
			returnValue = pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			release();
		}
		return returnValue;
	}


	public void release() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) { 
				st.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
