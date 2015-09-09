package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Recommen;
import com.snaillove.utils.Page;

public interface RecommenDao {
	/**
	 * �����Ƽ�
	 * @param recoomen
	 */
	public void saveRecommen(Recommen recoomen);

	/**
	 * ɾ���Ƽ�
	 * @param id
	 */
	public void delRecommen(int id);
	
	/**
	 * ͨ���龰UUID��ѯ�Ƽ��龰
	 * @param suuid
	 * @return
	 */
	public Recommen getRecommenBySuuid(String suuid);

	/**
	 * ��ȡȫ���Ƽ�
	 * @return
	 */
	public List<?> getAllRecommen();

	/**
	 * ��ҳ��ȡȫ���Ƽ�
	 * @return
	 */
	public List<?> getSearchRecommen(Page page);
	
	/**
	 * ͨ��ID��ѯһ���Ƽ��龰
	 * @return
	 */
	public Recommen getRecommen(int id);

	/**
	 * ��ȡ�Ƽ�������
	 * @return
	 */
	public int getAllCount();

	/**
	 * ��ȡ�Ƽ�������
	 * @return
	 */
	public int getAllCount(String keyword);
	
	
	/**
	 * ��ȡ�Ƽ��б����������
	 * @return
	 */
	public List<?> getRecommenList();
	
	/**
	 * �޸��龰
	 * @param recommen
	 */
	public void uppRecommen(Recommen recommen);
}
