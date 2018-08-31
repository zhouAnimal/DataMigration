package org.big.wy.entity;
//外源数据库
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "ATest", schema = "biodata")
public class ATest {
	@Id
	private String id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

}
