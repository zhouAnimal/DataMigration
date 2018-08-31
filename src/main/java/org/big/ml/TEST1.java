package org.big.ml;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.persistence.Column;

//名录
@Entity
@Table(name="TEST1",schema = "colchina")
public class TEST1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tag_id")
	private int tagId;

	@Column(name="date_up")
	private Timestamp dateUp;
	
	public TEST1() {
	}
	public int getTagId() {
		return this.tagId;
	}
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	public Timestamp getDateUp() {
		return this.dateUp;
	}
	public void setDateUp(Timestamp dateUp) {
		this.dateUp = dateUp;
	}

}
