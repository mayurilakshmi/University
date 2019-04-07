package com.UniersityDemo;

public class Address {
int line;
String Area;
String district;
String state;

public int getLine() {
	return line;
}
public void setLine(int line) {
	this.line = line;
}
public String getArea() {
	return Area;
}
public void setArea(String area) {
	Area = area;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [line=" + line + ", Area=" + Area + ", district=" + district + ", state=" + state + ", getLine()="
			+ getLine() + ", getArea()=" + getArea() + ", getDistrict()=" + getDistrict() + ", getState()=" + getState()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
