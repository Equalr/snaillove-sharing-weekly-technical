package com.snaillove.bean;

import java.util.List;

public class SingleChannel {
	private boolean isopen;// �Ƿ�Ϊ���Žӿ�(true��ʾ�ǿ��Žӿ�,false��ʾ���ǿ��Žӿ� PS��1.QQ�������ڲ����ŵĽӿ� 2.falseʱAppͨ���ؼ�������ҳ)
	private String url;// ��isopenΪfalseʱΪ�ÿؼ���ȡ��ַ����isopenΪtrueʱ���ؿ�ֵ
	private List<SingleMusic> list;//��isopenΪtrueʱ��ȡ�����б���isopenΪfalseʱ���ؿ�ֵ

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<SingleMusic> getList() {
		return list;
	}

	public void setList(List<SingleMusic> list) {
		this.list = list;
	}

}
