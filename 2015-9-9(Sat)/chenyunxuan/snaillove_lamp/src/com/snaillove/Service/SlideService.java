package com.snaillove.Service;

import java.util.List;

import com.snaillove.model.Slide;
import com.snaillove.utils.Page;
import com.snaillove.utils.Result;

public interface SlideService {
	/**
	 * ��ѯ����δ���߼�ɾ�����ֲ�ͼ�б���Ϣ
	 * @return
	 */
	public List<Slide> getAllSlide();
	
	/**
	 * ͨ��ID��ѯһ���ֲ�ͼ��Ϣ
	 * 
	 * @param id
	 * @return
	 */
	public Slide getById(int id);

	/**
	 * �����ֲ�ͼ��Ϣ
	 * 
	 * @param Slide
	 */
	public void saveSlide(Slide slide);

	/**
	 * �޸��ֲ�ͼ��Ϣ
	 * 
	 * @param Slide
	 */
	public void uppSlide(Slide slide);

	/**
	 * ɾ��һ���ֲ�ͼ��Ϣ
	 * 
	 * @param id
	 */
	public void delSlide(int id);

	/**
	 * ��ҳ��ѯ�����ֲ�ͼ��Ϣ
	 * 
	 * @param Slide
	 */
	public Result getAllSlide(Page page);
}
