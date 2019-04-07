package com.Client;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.UniersityDemo.Address;
import com.UniersityDemo.College;
import com.UniersityDemo.Department;
import com.UniersityDemo.Student;
import com.UniersityDemo.University;

public class Client {
	enum state{
		Karnataka,andhra,mumbai;
	}
	enum name{
		ECE,CSE,IT,EEE,MECH;
		//here  a just shutup and getout
	}
	public static void main(String[] args) throws JAXBException {
	/*	University u=new University();
		u.setName("JNTUK");
		
	Address add=new Address();
	add.setLine(1);
	add.setArea("prlayout");
	add.setDistrict("marthahalli");
	state s=state.Karnataka;
	System.out.println(s);
	u.setAddress(add);
	
	College c=new College();
	c.setName("QIS");
	Department d=new Department();
	name n=name.ECE;
	
	System.out.println(n);
	d.setName("ECE");
	Student st=new Student();
	st.setId(101);
	st.setName("LP");
	st.setMarks(400);
	Student st1=new Student();
	st1.setId(102);
	st1.setName("madhu");
	st1.setMarks(700);
	Student st2=new Student();
	st2.setId(103);
	st2.setName("srikanth");
	st2.setMarks(900);
	Set<Student> one=new HashSet<Student>();
	one.add(st);
	one.add(st1);
	one.add(st2);
	c.setStudents(one);
	
	List<College> collegeList=new ArrayList<College>();
	collegeList.add(c);
	u.setColleges(collegeList);
*/	
	//System.out.println(u);
	JAXBContext jaxbContext = JAXBContext.newInstance(University.class);
	 Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	// jaxbMarshaller.marshal(u, new File("./university.xml"));
	
	
	
	
		
		
	}

}
