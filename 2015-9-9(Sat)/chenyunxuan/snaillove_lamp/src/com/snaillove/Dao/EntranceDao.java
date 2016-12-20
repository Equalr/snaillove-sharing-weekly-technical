package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Entrance;
import com.snaillove.utils.Page;

public interface EntranceDao {
	/**
	 * ��ȡ����δ���߼�ɾ������������б���Ϣ
	 * @return
	 */
	public List<Entrance> getAllEntrance();
	
	/**
	 * ͨ��ID��ѯһ���������
	 * @param id
	 * @return
	 */
	public Entrance getByid(int id);
	
	/**
	 * ����һ���������
	 * 
	 * @param entrance
	 */
	public void save(Entrance entrance);

	/**
	 * �޸�һ���������
	 * 
	 * @param entrance
	 */
	public void upp(Entrance entrance);

	/**
	 * ɾ��һ���������
	 * 
	 * @param id
	 */
	public void del(int id);

	/**
	 * ��ҳ��ѯ��������б�
	 * 
	 * @param keyword
	 * @return
	 */
	public List<?> getSearchEntrance(Page page);

	/**
	 * ������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount();

	/**
	 * ��������������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount(String keyword);
}
