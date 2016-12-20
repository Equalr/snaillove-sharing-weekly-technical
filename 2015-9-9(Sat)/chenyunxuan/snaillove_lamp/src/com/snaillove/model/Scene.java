package com.snaillove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scene")
public class Scene {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String uuid;
	private String cuuid;
	private String sname;
	private int effect;
	private int checklight;
	private int rnum;
	private int gnum;
	private int bnum;
	private int lightadd;
	private int state;
	private int sort;
	private String thumbnail;
	private int recommed;
	private String scenebak;
	private String createtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCuuid() {
		return cuuid;
	}

	public void setCuuid(String cuuid) {
		this.cuuid = cuuid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getEffect() {
		return effect;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}

	public int getChecklight() {
		return checklight;
	}

	public void setChecklight(int checklight) {
		this.checklight = checklight;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public int getGnum() {
		return gnum;
	}

	public void setGnum(int gnum) {
		this.gnum = gnum;
	}

	public int getBnum() {
		return bnum;
	}

	public void setBnum(int bnum) {
		this.bnum = bnum;
	}

	public int getLightadd() {
		return lightadd;
	}

	public void setLightadd(int lightadd) {
		this.lightadd = lightadd;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public int getRecommed() {
		return recommed;
	}

	public void setRecommed(int recommed) {
		this.recommed = recommed;
	}

	public String getScenebak() {
		return scenebak;
	}

	public void setScenebak(String scenebak) {
		this.scenebak = scenebak;
	}

	/*
	 * create table scene ( id int primary key AUTO_INCREMENT COMMENT '�龰ID',
	 * uuid varchar(50) not null COMMENT '�龰UUID', cuuid varchar(50) not null
	 * COMMENT '����UUID', sname varchar(50) not null COMMENT '�龰����', effect
	 * int(2) COMMENT '�龰��Ч��0�޵�Ч,1�ɶ�,2�ʺ�,3���)', checklight int(2) COMMENT
	 * '�Ƿ��ȡRGB�͵��ӵ�Ч��0��ȡ,1����ȡ)', rnum int(3) default 0 COMMENT 'R', gnum int(3)
	 * default 0 COMMENT 'G', bnum int(3) default 0 COMMENT 'G', state int(2)
	 * COMMENT '�龰״̬��0���ߣ�1���ߣ�', lightadd int(2) COMMENT '���ӵ�Ч��0�޵���,1��˸,2����)',
	 * sort int(11) COMMENT '�龰�����', recommed int(2) COMMENT '�Ƿ��Ƽ���0�ǣ�1 ��',
	 * scenebak varchar(500) COMMENT '�龰����', createtime varchar(50) COMMENT
	 * '����ʱ��', endupptime timestamp COMMENT '����޸�ʱ��' )DEFAULT CHARSET=utf8;
	 */
}
