package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Classification;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;


public interface ClassificationService {
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
	 * ����ID��ѯһ��������Ϣ
	 * @param classification
	 */
	public Classification getClassification(int id);
	
	/**
	 * ����UUID��ѯһ��������Ϣ
	 * @param classification
	 */
	public Classification getClassificationByUuid(String uuid);

	/**
	 * ɾ��һ��������Ϣ
	 * @param id
	 */
	public void delClassification(int id);

	/**
	 * ��ҳ��ѯ���з�����Ϣ
	 * @param classification
	 */
	public Result getAllClassification(Page page);
	
	/**
	 * ��ѯ���з�����Ϣ
	 * @param classification
	 */
	public List<?> getClassificationAll();
}
