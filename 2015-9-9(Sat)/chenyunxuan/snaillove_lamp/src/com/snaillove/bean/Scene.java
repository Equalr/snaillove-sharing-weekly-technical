package com.snaillove.bean;

import java.util.List;

public class Scene {
	private String name;// �龰����
	private String description;// �龰����
	private int lampEffect;// �龰��Ч
	private Boolean lampEffectWithRGB;// true��ȡRGB����ӵ�Ч,false����ȡRGB����ӵ�Ч
	private int red;// red
	private int green;// green
	private int blue;// blue
	private String thumbnail;// �龰����ͼ
	private int attachedLampEffect;// ���ӵ�Ч
	private List<Music> musics;// �����б�name ��������,url �������� ,author �������ߣ�
	private List<Photo> photos;// �龰ͼƬ�б�url ͼƬ���ӣ�

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getLampEffect() {
		return lampEffect;
	}

	public void setLampEffect(int lampEffect) {
		this.lampEffect = lampEffect;
	}

	public Boolean getLampEffectWithRGB() {
		return lampEffectWithRGB;
	}

	public void setLampEffectWithRGB(Boolean lampEffectWithRGB) {
		this.lampEffectWithRGB = lampEffectWithRGB;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getAttachedLampEffect() {
		return attachedLampEffect;
	}

	public void setAttachedLampEffect(int attachedLampEffect) {
		this.attachedLampEffect = attachedLampEffect;
	}

	public List<Music> getMusics() {
		return musics;
	}

	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

}
