package com.wsn.pojo;

public class Role_authorization_object {
    private Integer raoId;

    private Role_authorization roleAuthorization;
    
    private Data_object dataObject;

	public Integer getRaoId() {
		return raoId;
	}

	public void setRaoId(Integer raoId) {
		this.raoId = raoId;
	}

	public Role_authorization getRoleAuthorization() {
		return roleAuthorization;
	}

	public void setRolrAuthorization(Role_authorization roleAuthorization) {
		this.roleAuthorization = roleAuthorization;
	}

	public Data_object getDataObject() {
		return dataObject;
	}

	public void setDataObject(Data_object dataObject) {
		this.dataObject = dataObject;
	}

	@Override
	public String toString() {
		return "Role_authorization_object [raoId=" + raoId
				+ ", roleAuthorization=" + roleAuthorization + ", dataObject="
				+ dataObject + "]";
	}
    
}