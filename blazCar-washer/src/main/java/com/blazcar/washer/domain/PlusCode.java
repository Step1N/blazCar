package com.blazcar.washer.domain;

import com.blazcar.washer.common.base.BaseDomain;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PlusCode extends BaseDomain {

	private String compoundCode;
	private String globalCode;
	public String getCompoundCode() {
		return compoundCode;
	}
	public void setCompoundCode(String compoundCode) {
		this.compoundCode = compoundCode;
	}
	public String getGlobalCode() {
		return globalCode;
	}
	public void setGlobalCode(String globalCode) {
		this.globalCode = globalCode;
	}
}
