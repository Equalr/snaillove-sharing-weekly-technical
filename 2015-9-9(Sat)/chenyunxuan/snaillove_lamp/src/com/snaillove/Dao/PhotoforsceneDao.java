package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Photoforscene;

public interface PhotoforsceneDao {
	
	/**
	 * ͨ��suuid��ѯ���龰���е�ͼƬ��ַ
	 * @param suuid
	 * @return
	 */
	public List<?> getScenephoto(String suuid);
	
	/**
	 * �����龰�����ͼƬ
	 * @param photoforscene
	 */
	public void saveScenephoto(Photoforscene photoforscene);
	
	/**
	 * �޸�ʱɾ���龰��Ӧ������ͼƬ
	 * @param suuid
	 */
	public void delAllphoto(String suuid);
}
