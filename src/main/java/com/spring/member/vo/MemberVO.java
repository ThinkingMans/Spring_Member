package com.spring.member.vo;

import java.sql.Date;

/*
create table member(
date date not null,
name varchar(20) not null,
id varchar(20) unique not null,
email varchar(64) unique not null,
passwd varchar(32) not null,
birthday varchar(6) not null,
gender varchar(1) not null,
phone varchar(11) not null,
address_code int not null,
address varchar(100) not null
);
 */
public class MemberVO {
	private Date date;
	private String name;
	private String id;
	private String email;
	private String passwd;
	private String birthday;
	private String gender;
	private String phone;
	private int address_code;
	private String address;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAddress_code() {
		return address_code;
	}
	public void setAddress_code(int address_code) {
		this.address_code = address_code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "MemberVO [date=" + date + ", name=" + name + ", id=" + id + ", email=" + email + ", passwd=" + passwd
				+ ", birthday=" + birthday + ", gender=" + gender + ", phone=" + phone + ", address_code="
				+ address_code + ", address=" + address + "]";
	}
	
}
