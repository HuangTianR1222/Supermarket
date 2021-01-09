package model;

import lib.Base;

public class Admin extends Base {
	private int id;
	private String name;
	private String password;
	private String createDate;

	private int getId() {
		return id;
	}

	public void setId(int id) {
		this.id  = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Admin login(Admin adminTmp) {
		// TODO Auto-generated method stub
		return null;
	}

	}

	

	
    
