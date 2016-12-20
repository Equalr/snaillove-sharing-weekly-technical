package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Entrance;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface EntranceService {
	/**
	 * ��ȡȫ��û�б��߼�ɾ������������б���Ϣ
	 * 
	 * @return
	 */
	public List<Entrance> getAllEntrance();

	/**
	 * ͨ��ID��ѯһ�����������Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public Entrance getById(int id);

	/**
	 * �������������Ϣ
	 * 
	 * @param Entrance
	 */
	public void saveEntrance(Entrance entrance);

	/**
	 * �޸����������Ϣ
	 * 
	 * @param Entrance
	 */
	public void uppEntrance(Entrance entrance);

	/**
	 * ɾ��һ�����������Ϣ
	 * 
	 * @param id
	 */
	public void delEntrance(int id);

	/**
	 * ��ҳ��ѯ�������������Ϣ
	 * 
	 * @param Entrance
	 */
	public Result getAllEntrance(Page page);
}
