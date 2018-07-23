package com.wsn.pojo;

public class Role_authorization {
    private Integer raId;

    private Role role;
    
    private Function function;

	public Integer getRaId() {
		return raId;
	}

	public void setRaId(Integer raId) {
		this.raId = raId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}
}