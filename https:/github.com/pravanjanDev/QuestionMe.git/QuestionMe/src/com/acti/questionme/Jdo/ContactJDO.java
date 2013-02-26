package com.acti.questionme.Jdo;


import java.io.Serializable;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
@SuppressWarnings("serial")
@PersistenceCapable(detachable = "true")
public class ContactJDO implements Serializable{

	@PrimaryKey
	private Key uniquekey;
	

	private String contactId;
	
	private String email = "";
	
	private String firstName = "";
	
	private String lastName = "";

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Key getUniquekey() {
		return uniquekey;
	}

	public void setUniquekey(Key uniquekey) {
		this.uniquekey = uniquekey;
	}
	
		
}
