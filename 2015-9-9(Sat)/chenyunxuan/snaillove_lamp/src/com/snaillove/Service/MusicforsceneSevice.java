package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Musicforscene;

public interface MusicforsceneSevice {
	/**
	 * ͨ���龰UUID��ȡ�����б�
	 * @return
	 */
	public List<?> getMusicList(String suuid);
	
	/**
	 * �����龰����
	 * @param musicforscene
	 */
	public void saveMusic(Musicforscene musicforscene);
	
	/**
	 * ͨ��IDɾ���龰����
	 * @param id
	 */
	public void delMusic(int id);
	
	
	/**
	 * ͨ��SIDȥ��о���ֿ����������Դ��ID,NAME,NAME_EN��
	 * @param sid
	 * @return
	 */
	public List<?> getMusic(String sid);
	
	/**
	 * ͨ��ID��ѯ������ַ
	 * @param id
	 * @return
	 */
	public String getMusicPath(int id);
}
