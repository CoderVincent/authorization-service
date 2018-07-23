package com.wsn.pojo;

public class Function {
    private Integer fId;

    private String functionNumber;

    private String functionName;

    private String description;
    
    private Resource resource;
    
    private Operate_type operate_type;

	public Integer getfId() {
		return fId;
	}

	public void setfId(Integer fId) {
		this.fId = fId;
	}

	public String getFunctionNumber() {
		return functionNumber;
	}

	public void setFunctionNumber(String functionNumber) {
		this.functionNumber = functionNumber;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Operate_type getOperate_type() {
		return operate_type;
	}

	public void setOperate_type(Operate_type operate_type) {
		this.operate_type = operate_type;
	}

	@Override
	public String toString() {
		return "Function [fId=" + fId + ", functionNumber=" + functionNumber
				+ ", functionName=" + functionName + ", description="
				+ description + ", resource=" + resource + ", operate_type="
				+ operate_type + "]";
	}

}