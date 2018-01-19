package com.beatles.page;

/**
 * @author zhang lj
 * @createTime 2018年1月19日 上午10:06:10
 */
public class MessageDTO {
	private boolean success = false;
	private String msg = "";
	private Object obj = null;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
