package com.UniersityDemo;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class College {
private String name;
private Set<Department> departments;
private Set<Student> students;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "College [name=" + name + ", departments=" + departments + ", students=" + students + "]";
}
public Set<Department> getDepartments() {
	return departments;
}
public void setDepartments(Set<Department> departments) {
	this.departments = departments;
}

@XmlElementWrapper(name="Students")
@XmlElement(name="Student")
public Set<Student> getStudents() {
	return students;
}
public void setStudents(Set<Student> students) {
	this.students = students;
}
}
