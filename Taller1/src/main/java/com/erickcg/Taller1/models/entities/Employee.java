package com.erickcg.Taller1.models.entities;

public class Employee {
	private String code;
	private String name;
	private String secondName;
	private String dateOfHire;
	private String state;
	private String rol;
	private String password;
	
	public Employee(String code, String name, String secondName, String dateOfHire, String state, String rol,
			String password) {
		super();
		this.code = code;
		this.name = name;
		this.secondName = secondName;
		this.dateOfHire = dateOfHire;
		this.state = state;
		this.rol = rol;
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
