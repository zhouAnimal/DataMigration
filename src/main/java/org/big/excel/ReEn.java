package org.big.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class ReEn {
	
	@Excel(name = "SpeciesID")//标题，与excel保持一致
	private int tagId;//自定义
	
	@Excel(name = "hbsj")
	private String tagEn;

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagEn() {
		return tagEn;
	}

	public void setTagEn(String tagEn) {
		this.tagEn = tagEn;
	}
	
	

}
