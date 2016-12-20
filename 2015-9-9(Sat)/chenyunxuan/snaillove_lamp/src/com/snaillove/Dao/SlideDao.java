package com.snaillove.Dao;

import java.util.List;

import com.snaillove.model.Slide;
import com.snaillove.utils.Page;

public interface SlideDao {
	/**
	 * ��ѯ����δ���߼�ɾ�����ֲ�ͼ�б���Ϣ
	 * 
	 * @return
	 */
	public List<Slide> getAllSlide();

	/**
	 * ��ѯһ���ֲ�ͼ
	 * @param id
	 * @return
	 */
	public Slide getById(int id);
	
	/**
	 * ����һ���ֲ�ͼ
	 * 
	 * @param channel
	 */
	public void save(Slide slide);

	/**
	 * �޸�һ���ֲ�ͼ
	 * 
	 * @param slide
	 */
	public void upp(Slide slide);

	/**
	 * ɾ��һ���ֲ�ͼ
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
	public List<?> getSearchSlide(Page page);

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