package com.snaillove.bean;

public class SingleMusic {
	private String name;// ������
	private String author;// ��������
	private String path;// ����·��
	private String coverpath_small;// ��������·��(С)
	private String coverpath_middle;// ��������·��(��)
	private String coverpath_large;// ��������·��(��)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getCoverpath_small() {
		return coverpath_small;
	}

	public void setCoverpath_small(String coverpath_small) {
		this.coverpath_small = coverpath_small;
	}

	public String getCoverpath_middle() {
		return coverpath_middle;
	}

	public void setCoverpath_middle(String coverpath_middle) {
		this.coverpath_middle = coverpath_middle;
	}

	public String getCoverpath_large() {
		return coverpath_large;
	}

	public void setCoverpath_large(String coverpath_large) {
		this.coverpath_large = coverpath_large;
	}

}
