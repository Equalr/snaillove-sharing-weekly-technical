package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Searchchannel;
import com.snaillove.utils.Page;

public interface SearchchannelDao{
	/**
	 * ��ȡ����δ���߼�ɾ��������������Ϣ
	 * @return
	 */
	public List<Searchchannel> getAllSearchchannel();
	
	/**
	 * ͨ��ID��ѯһ����������
	 * @param id
	 * @return
	 */
	public Searchchannel getByid(int id);
	
	/**
	 * ����һ����������
	 * 
	 * @param channel
	 */
	public void save(Searchchannel channel);

	/**
	 * �޸�һ����������
	 * 
	 * @param Channel
	 */
	public void upp(Searchchannel channel);

	/**
	 * ɾ��һ����������
	 * 
	 * @param id
	 */
	public void del(int id);

	/**
	 * ��ҳ��ѯ¼��ͼ�б�
	 * 
	 * @param keyword
	 * @return
	 */
	public List<?> getSearchChannel(Page page);

	/**
	 * ������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount();

	/**
	 * ��������������
	 * 
	 * @param keyword
	 * @return
	 */
	public int getAllCount(String keyword);
}
