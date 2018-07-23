package com.wsn.pojo;

public class Resource_data_object_type {
    private Integer rdotId;

    private Data_object_type dataObjectType;
    
    private Resource resource;

	public Integer getRdotId() {
		return rdotId;
	}

	public void setRdotId(Integer rdotId) {
		this.rdotId = rdotId;
	}

	public Data_object_type getDataObjectType() {
		return dataObjectType;
	}

	public void setDataObjectType(Data_object_type dataObjectType) {
		this.dataObjectType = dataObjectType;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public String toString() {
		return "Resource_data_object_type [rdotId=" + rdotId
				+ ", dataObjectType=" + dataObjectType + ", resource="
				+ resource + "]";
	}
    
}