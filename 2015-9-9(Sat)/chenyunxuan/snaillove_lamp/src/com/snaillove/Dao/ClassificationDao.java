package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Classification;
import com.snaillove.utils.Page;


public interface ClassificationDao {

	/**
	 * ����������Ϣ
	 * 
	 * @param classification
	 */
	public void saveClassification(Classification classification);

	/**
	 * �޸ķ�����Ϣ
	 * 
	 * @param classification
	 */
	public void uppClassification(Classification classification);
	
	/**
	 * ͨ��ID��ѯһ��������Ϣ
	 * 
	 * @param classification
	 */
	public Classification getClassification(int id);
	
	/**
	 * ͨ��UUID��ѯһ��������Ϣ
	 * 
	 * @param classification
	 */
	public Classification getClassificationByUuid(String uuid);
	
	/**
	 * ɾ��һ��������Ϣ
	 * @param id
	 */
	public void delClassification(int id);
	
	/**
	 * ��ѯ���з�����Ϣ
	 * 
	 * @param classification
	 */
	public List<?> getAllClassification();
	
	/**
	 * ��ѯ���з�����Ϣ
	 * @param classification
	 */
	public List<?> getSearchClassification(Page page);
	
	/**
	 * ��ѯ������Ϣ������
	 * @param page
	 * @return
	 */
	public int getAllCount();
}
