package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Searchchannel;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface SearchchannelService {
	/**
	 * ��ȡ����δ���߼�ɾ��������������Ϣ
	 * 
	 * @return
	 */
	public List<Searchchannel> getAllSearchchannel();

	/**
	 * ͨ��ID��ѯһ������������Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public Searchchannel getById(int id);

	/**
	 * ��������������Ϣ
	 * 
	 * @param Searchchannel
	 */
	public void saveSearchchannel(Searchchannel searchchannel);

	/**
	 * �޸�����������Ϣ
	 * 
	 * @param Searchchannel
	 */
	public void uppSearchchannel(Searchchannel searchchannel);

	/**
	 * ɾ��һ������������Ϣ
	 * 
	 * @param id
	 */
	public void delSearchchannel(int id);

	/**
	 * ��ҳ��ѯ��������������Ϣ
	 * 
	 * @param Searchchannel
	 */
	public Result getAllSearchchannel(Page page);
}
