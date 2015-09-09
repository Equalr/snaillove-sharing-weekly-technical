package com.snaillove.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classification")
public class Classification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String uuid;
	private String cname;
	private int state;
	private int sort;
	private String createtime;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	/*id int primary key AUTO_INCREMENT COMMENT '����ID',
    uuid varchar(50) not null COMMENT '����UUID',
    state int(2) not null COMMENT '����״̬��0�ԣ�1����',
    cname varchar(50) not null COMMENT '��������',
    sort int(11) COMMENT '�����',
    createtime varchar(50) COMMENT '����ʱ��',
	endupptime timestamp COMMENT '����޸�ʱ��'*/
}
