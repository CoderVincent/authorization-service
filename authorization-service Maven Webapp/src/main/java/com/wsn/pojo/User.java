package com.wsn.pojo;

public class User {
	
	private Integer u_id;
	private String nickname;
	private String account;
	private String password;
	
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", nickname=" + nickname + ", account="
				+ account + ", password=" + password + "]";
	}
	
	
}
