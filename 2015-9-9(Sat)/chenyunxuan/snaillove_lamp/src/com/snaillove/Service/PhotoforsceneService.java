package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Photoforscene;

public interface PhotoforsceneService {
	
	/**
	 * ��ȡ�龰ͼƬ
	 * @param suuid
	 * @return
	 */
	public List<?> getScenephoto(String suuid);
	
	/**
	 * �����龰ͼƬ
	 * @param photoforscene
	 */
	public void saveScenephoto(Photoforscene photoforscene);
	
	/**
	 * �޸�ʱɾ�����龰��ͼƬ
	 * @param suuid
	 */
	public void delScenephoto(String suuid);
}
