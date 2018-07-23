package com.wsn.pojo;

public class Data_object {
    private Integer doId;

    private Data_object_type dot;
    
    private String doName;

    public Integer getDoId() {
        return doId;
    }

    public void setDoId(Integer doId) {
        this.doId = doId;
    }

	public String getDoName() {
		return doName;
	}

	public void setDoName(String doName) {
		this.doName = doName;
	}

	public Data_object_type getDot() {
		return dot;
	}

	public void setDot(Data_object_type dot) {
		this.dot = dot;
	}

	@Override
	public String toString() {
		return "Data_object [doId=" + doId + ", dot=" + dot + ", doName="
				+ doName + "]";
	}
}