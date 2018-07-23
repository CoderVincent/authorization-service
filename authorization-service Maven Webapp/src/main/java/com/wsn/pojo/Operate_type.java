package com.wsn.pojo;

public class Operate_type {
    private Integer otId;

    private String otNumber;

    private String otName;

    private String otDescribtion;

    public Integer getOtId() {
        return otId;
    }

    public void setOtId(Integer otId) {
        this.otId = otId;
    }

    public String getOtNumber() {
        return otNumber;
    }

    public void setOtNumber(String otNumber) {
        this.otNumber = otNumber == null ? null : otNumber.trim();
    }

    public String getOtName() {
        return otName;
    }

    public void setOtName(String otName) {
        this.otName = otName == null ? null : otName.trim();
    }

    public String getOtDescribtion() {
        return otDescribtion;
    }

    public void setOtDescribtion(String otDescribtion) {
        this.otDescribtion = otDescribtion == null ? null : otDescribtion.trim();
    }

	@Override
	public String toString() {
		return "Operate_type [otId=" + otId + ", otNumber=" + otNumber
				+ ", otName=" + otName + ", otDescribtion=" + otDescribtion
				+ "]";
	}
}