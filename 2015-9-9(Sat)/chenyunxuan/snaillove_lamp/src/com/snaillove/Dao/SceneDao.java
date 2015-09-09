package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Scene;
import com.snaillove.utils.Page;

public interface SceneDao {
	/**
	 * �����龰
	 * 
	 * @param Scene
	 */
	public void saveScene(Scene scene);

	/**
	 * �޸��龰
	 * 
	 * @param Scene
	 */
	public void uppScene(Scene scene);
	
	
	/**
	 * ͨ������UUID��ѯ��������û���龰���з��� true,û�з���false��
	 * @param cuuid
	 * @return
	 */
	public Boolean getSceneByCuuid(String cuuid);

	/**
	 * ɾ���龰��Ϣ
	 * 
	 * @param id
	 */
	public void delScene(int id);
	
	/**
	 * ����ID���һ���龰��Ϣ
	 * @param id
	 * @return
	 */
	public Scene getScene(int id);

	/**
	 * ����UUID���һ���龰��Ϣ
	 * @param id
	 * @return
	 */
	public Scene getSceneByUuid(String uuid);
	
	/**
	 * ��ѯ�����龰��Ϣδ���Ƽ���
	 * 
	 * @return
	 */
	public List<?> getAllScene(String keyword);

	/**
	 * ��ҳ��ѯ�龰��Ϣ
	 * 
	 * @param keyword
	 * @param page
	 * @return
	 */
	public List<?> getSearchScene(Page page);

	/**
	 * ��ȡ������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount(String keyword);

	/**
	 * ��ȡ������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount();
	
	/**
	 * ��ȡȫ���ɱ�ҡһҡ���龰(recommed==1)
	 * @return
	 */
	public List<?> getReSceneList();
}
