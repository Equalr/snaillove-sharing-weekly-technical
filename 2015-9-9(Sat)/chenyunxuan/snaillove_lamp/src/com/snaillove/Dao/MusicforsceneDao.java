package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Musicforscene;

public interface MusicforsceneDao {
	/**
	 * ͨ���龰UUID��ȡ�����б�
	 * @return
	 */
	public List<?> getMusicList(String uuid);
	
	/**
	 * ����о���ֿ���ͨ��SID�ҵ�����
	 * @param mname
	 * @return
	 */
	public List<?> getMusic(String sid);
	
	
	/**
	 * ͨ��ID��ѯ��������
	 * @param id
	 * @return
	 */
	public String getmusic(int id);
	
	/**
	 * �����龰����
	 */
	public void saveMusic(Musicforscene musicforscene);
	
	/**
	 * ɾ���龰����
	 * @param id
	 */
	public void delMusic(int id);
}
