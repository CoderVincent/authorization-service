package com.wsn.pojo;

public class VerifyFunction {
	private int id;
	private String functionNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFunctionNumber() {
		return functionNumber;
	}
	public void setFunctionNumber(String functionNumber) {
		this.functionNumber = functionNumber;
	}
	@Override
	public String toString() {
		return "VerifyFunction [id=" + id + ", functionNumber="
				+ functionNumber + "]";
	}
	
}	
