package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Scene;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface SceneService {

	/**
	 * ��ҳ��ѯ�龰
	 * @param zPage
	 * @return
	 */
	public Result getSearchAllScene(Page zPage);

	/**
	 * ɾ���龰
	 * @param id
	 */
	public void delScene(int id);

	/**
	 * ͨ��ID��ȡһ���龰
	 * @param id
	 */
	public Scene getScene(int id);
	
	/**
	 * ͨ��UUID��ȡһ���龰
	 * @param id
	 */
	public Scene getSceneInfo(String uuid);

	/**
	 * �޸��龰
	 * @param scene
	 */
	public void uppScene(Scene scene);

	/**
	 * �����龰
	 * @param scene
	 */
	public void addScene(Scene scene);
	
	/**
	 * ���ݷ���UUID��ѯ�龰(��true,û��false)
	 * @param cuuid
	 * @return
	 */
	public Boolean getSceneByCuuid(String cuuid);
	
	/**
	 * ��ȡû�б��Ƽ��������龰
	 * @return
	 */
	public List<?> getAllScene(String keyword);
	
	/**
	 * ��ȡ�ɱ�ҡһҡ���龰
	 * @return
	 */
	public List<?> getReScene();
}
