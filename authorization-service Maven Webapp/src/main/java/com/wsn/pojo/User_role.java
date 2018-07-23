package com.wsn.pojo;

public class User_role {
    private Integer urId;

    private User user;
    
    private Role role;

	public Integer getUrId() {
		return urId;
	}

	public void setUrId(Integer urId) {
		this.urId = urId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User_role [urId=" + urId + ", user=" + user + ", role=" + role
				+ "]";
	}
}