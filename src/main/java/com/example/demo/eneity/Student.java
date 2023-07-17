package com.example.demo.eneity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
public String name;
public String roll;

@Autowired
public Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRoll() {
	return roll;
}
public void setRoll(String roll) {
	this.roll = roll;
}

}
