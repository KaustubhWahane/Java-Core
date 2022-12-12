package com.anudip.Hibernatedemo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	private String ename;
	@Id
	private int eid;
	private String dept;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", dept=" + dept + "]";
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
