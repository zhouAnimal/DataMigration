package org.big.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class SpeciesName {
	
	@Excel(name = "Name")//标题，与excel保持一致
	private int speciesName;//自定义

	public int getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(int speciesName) {
		this.speciesName = speciesName;
	}
	
	
	

}
