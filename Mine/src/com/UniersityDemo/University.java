package com.UniersityDemo;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class University {
	
 private String name;
	
 private Address address;
	
 private List<College> colleges;
	@XmlElement
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@XmlElement(name="collegeAdress")
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@XmlElementWrapper(name="Colleges")
@XmlElement(name="college")
public List<College> getColleges() {
	return colleges;
}
public void setColleges(List<College> colleges) {
	this.colleges = colleges;
}
@Override
public String toString() {
	return "University [name=" + name + ", address=" + address + ", colleges=" + colleges + ", getName()=" + getName()
			+ ", getAddress()=" + getAddress() + ", getColleges()=" + getColleges() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
 
 
}
