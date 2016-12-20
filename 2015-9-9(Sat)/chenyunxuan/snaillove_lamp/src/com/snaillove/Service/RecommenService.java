package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Recommen;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface RecommenService {
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
	 * ͨ���龰UUID��ѯһ���Ƽ��龰
	 * @param suuid
	 * @return
	 */
	public Recommen getRecommenBySuuid(String suuid);
	
	/**
	 * ͨ��ID��ѯһ���Ƽ��龰
	 * @param id
	 * @return
	 */
	public Recommen getRecommen(int id);

	/**
	 * ��ȡȫ���Ƽ�
	 * @return
	 */
	public List<?> getAllRecommen();

	/**
	 * ��ҳ��ȡȫ���Ƽ�
	 * @return
	 */
	public Result getSearchRecommen(Page page);

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
