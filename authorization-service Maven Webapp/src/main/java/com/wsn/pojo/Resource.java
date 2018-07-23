package com.wsn.pojo;

public class Resource {
    private Integer resourceId;

    private String resourceName;

    private String resourceNumber;

    private String resourceDescribe;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourceNumber() {
        return resourceNumber;
    }

    public void setResourceNumber(String resourceNumber) {
        this.resourceNumber = resourceNumber == null ? null : resourceNumber.trim();
    }

    public String getResourceDescribe() {
        return resourceDescribe;
    }

    public void setResourceDescribe(String resourceDescribe) {
        this.resourceDescribe = resourceDescribe == null ? null : resourceDescribe.trim();
    }

	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceName="
				+ resourceName + ", resourceNumber=" + resourceNumber
				+ ", resourceDescribe=" + resourceDescribe + "]";
	}
}