package com.anudip.Dec;

public class UserClass {
	private String Uname;
	private int password;
	private String dept;
	public UserClass() {
		super();
	}
	
	public String getUname() {
		return Uname;
	}

	public void setUname(String uname) {
		this.Uname = uname;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "UserClass [uname=" + Uname + ", password=" + password + ", dept=" + dept + "]";
	}
	
}
