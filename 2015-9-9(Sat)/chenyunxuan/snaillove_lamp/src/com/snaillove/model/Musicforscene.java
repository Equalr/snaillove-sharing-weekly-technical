package com.snaillove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musicforscene")
public class Musicforscene {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String suuid;
	private int musicid;
	private int musictype;//(0��о��1ϲ������)
	private String musicname;
	private String musiccher;
	private String musicurl;
	private String createtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSuuid() {
		return suuid;
	}

	public void setSuuid(String suuid) {
		this.suuid = suuid;
	}

	public int getMusicid() {
		return musicid;
	}

	public void setMusicid(int musicid) {
		this.musicid = musicid;
	}

	public String getMusicname() {
		return musicname;
	}

	public void setMusicname(String musicname) {
		this.musicname = musicname;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getMusiccher() {
		return musiccher;
	}

	public void setMusiccher(String musiccher) {
		this.musiccher = musiccher;
	}

	public String getMusicurl() {
		return musicurl;
	}

	public void setMusicurl(String musicurl) {
		this.musicurl = musicurl;
	}

	public int getMusictype() {
		return musictype;
	}

	public void setMusictype(int musictype) {
		this.musictype = musictype;
	}
	
	/*create table musicforscene
(
	id int primary key AUTO_INCREMENT COMMENT '�龰����ID',
    suuid varchar(50) not null COMMENT '�龰UUID',
    musicid int(11) COMMENT '����ID',
    musicname varchar(50) COMMENT '��������',
    musiccher varchar(50) COMMENT '��������',
    musicurl varchar(255) COMMENT '���ֵ�ַ',
	createtime varchar(50) COMMENT '����ʱ��',
    endupptime timestamp COMMENT '����޸�ʱ��'
)DEFAULT CHARSET=utf8;*/
}
