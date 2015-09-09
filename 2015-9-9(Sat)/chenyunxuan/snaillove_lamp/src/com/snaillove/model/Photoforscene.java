package com.snaillove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "photoforscene")
public class Photoforscene {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String suuid;
	private String imgurl;
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

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	/*id int primary key AUTO_INCREMENT COMMENT '�龰ͼƬID',
	suuid varchar(50) not null COMMENT '�龰UUID',
	imgurl varchar(50) not null COMMENT '�龰ͼƬ·��',
    createtime varchar(50) COMMENT '����ʱ��',
    endupptime timestamp COMMENT '����޸�ʱ��'*/
}
