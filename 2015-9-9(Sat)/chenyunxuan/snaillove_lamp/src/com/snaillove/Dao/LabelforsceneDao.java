package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Labelforscene;

public interface LabelforsceneDao {
	
	/**
	 * ������ǩ
	 * @param labelforscene
	 */
	public void saveLabelforscene(Labelforscene labelforscene);
	
	/**
	 * ͨ���龰UUID��ѯ��ǩ�б�
	 * @param suuid
	 * @return
	 */
	public List<?> getLabelList(String suuid);
	
	/**
	 * ɾ��һ���龰��ǩ����
	 * @param id
	 */
	public void delLabelforscene(int id);
	
	/**
	 * ��ȡ���б�ǩ
	 * @return
	 */
	public List<?> getAllLabelList();
}
