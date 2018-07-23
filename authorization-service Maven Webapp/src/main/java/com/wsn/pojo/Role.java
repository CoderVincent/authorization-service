package com.wsn.pojo;

public class Role {
	private int r_id;
	private String role_name;
	private String role_number;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_number() {
		return role_number;
	}
	public void setRole_number(String role_number) {
		this.role_number = role_number;
	}
	
	@Override
	public String toString() {
		return "Role [r_id=" + r_id + ", role_name=" + role_name
				+ ", role_number=" + role_number + "]";
	}
	
}
