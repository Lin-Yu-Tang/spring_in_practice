package com.cmdev.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cmdevuser")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String name;
	
	@Column(name = "useraccount")
	private String account;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "register_date")
	private Date registerDate;
	
	public User() {}

	public User(String name, String account, String password) {
		this.name = name;
		this.account = account;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password
				+ ", registerDate=" + registerDate + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
