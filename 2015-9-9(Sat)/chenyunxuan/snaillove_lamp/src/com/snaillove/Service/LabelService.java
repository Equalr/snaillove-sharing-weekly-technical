package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Label;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface LabelService {
	/**
	 * ������ǩ��Ϣ
	 * 
	 * @param Label
	 */
	public void saveLabel(Label label);

	/**
	 * �޸ı�ǩ��Ϣ
	 * 
	 * @param Label
	 */
	public void uppLabel(Label label);

	/**
	 * ����ID��ѯһ����ǩ��Ϣ
	 * @param Label
	 */
	public Label getLabel(int id);

	/**
	 * ����UUID��ѯһ����ǩ��Ϣ
	 * @param Label
	 */
	public Label getLabelByUuid(String uuid);

	/**
	 * ɾ��һ����ǩ��Ϣ
	 * @param id
	 */
	public void delLabel(int id);

	/**
	 * ��ҳ��ѯ���б�ǩ��Ϣ
	 * @param Label
	 */
	public Result getSearchAllLabel(Page page);

	/**
	 * ��ѯ���б�ǩ��Ϣ
	 * @param Label
	 */
	public List<?> getAllLabel(String keyword,String suuid);
}
