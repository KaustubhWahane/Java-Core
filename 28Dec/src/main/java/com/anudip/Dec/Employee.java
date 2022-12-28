package com.anudip.Dec;

import java.util.List;
import java.util.Set;

public class Employee {
	private String ename;
	private List<String> phones;
	private Set<Integer> contacts;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<Integer> getContacts() {
		return contacts;
	}
	public void setContacts(Set<Integer> contacts) {
		this.contacts = contacts;
	}
	public Employee(String ename, List<String> phones, Set<Integer> contacts) {
		super();
		this.ename = ename;
		this.phones = phones;
		this.contacts = contacts;
	}
	
}
