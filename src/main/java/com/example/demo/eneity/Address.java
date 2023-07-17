package com.example.demo.eneity;

import org.springframework.stereotype.Component;

@Component
public class Address {
String Dno;
String flatno;
String surname;

public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getDno() {
	return Dno;
}
public void setDno(String dno) {
	Dno = dno;
}
public String getFlatno() {
	return flatno;
}
public void setFlatno(String flatno) {
	this.flatno = flatno;
}

}
