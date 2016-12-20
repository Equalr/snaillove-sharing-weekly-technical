package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Label;
import com.snaillove.utils.Page;

public interface LabelDao {
	/**
	 * ���ӱ�ǩ
	 * 
	 * @param label
	 */
	public void saveLabel(Label label);

	/**
	 * �޸ı�ǩ
	 * 
	 * @param label
	 */
	public void uppLabel(Label label);

	/**
	 * ɾ����ǩ��Ϣ
	 * 
	 * @param id
	 */
	public void delLabel(int id);
	
	/**
	 * ����ID���һ����ǩ��Ϣ
	 * @param id
	 * @return
	 */
	public Label getLabel(int id);

	/**
	 * ����UUID���һ����ǩ��Ϣ
	 * @param id
	 * @return
	 */
	public Label getLabelByUuid(String uuid);
	
	/**
	 * ��ѯ���б�ǩ��Ϣ
	 * 
	 * @return
	 */
	public List<?> getAllLabel(String keyword,String suuid);

	/**
	 * ��ҳ��ѯ��ǩ��Ϣ
	 * 
	 * @param keyword
	 * @param page
	 * @return
	 */
	public List<?> getSearchLabel(Page page);

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
}
