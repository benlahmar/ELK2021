package com.habib.moi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "bank2022")
public class Bank {

	@Id
	String id;
	@Field(name = "account_number")
	int ncompte;
	@Field()
	String firstname;
	String lastname;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNcompte() {
		return ncompte;
	}
	public void setNcompte(int ncompte) {
		this.ncompte = ncompte;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
