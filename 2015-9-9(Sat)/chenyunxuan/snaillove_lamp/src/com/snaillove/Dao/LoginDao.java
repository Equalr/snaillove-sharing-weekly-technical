package com.snaillove.Dao;

public interface LoginDao {
	/**
	 * ����¼
	 * @param uname
	 * @param password
	 * @return
	 */
	public Boolean checkLogin(String uname,String password);
}
