
package com.example.customer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customId;
	private String customName;
	private String customNID;
	private String customDOB;
	private String customFatherName;
	private String customMotherName;
	private String customAddr;
	private String customPhoneNum;
	private String customAccountNum;
	

	public Customer() {
		
	}
	
	public Customer(int customId, String customName, String customNID,String customDOB,String customFatherName,String customMotherName,
			String customAddr,String customPhoneNum,String customAccountNum) {
		super();
		this.customId = customId;
		this.customName = customName;
		this.customNID = customNID;
		this.customDOB = customDOB;
		this.customFatherName = customFatherName;
		this.customMotherName = customMotherName;
		this.customAddr = customAddr;
		this.customPhoneNum = customPhoneNum;
		this.customAccountNum = customAccountNum;
	}

	public int getCustomId() {
		return customId;
	}



	public void setCustomId(int customId) {
		this.customId = customId;
	}



	public String getCustomName() {
		return customName;
	}



	public void setCustomName(String customName) {
		this.customName = customName;
	}



	public String getCustomNID() {
		return customNID;
	}



	public void setCustomNID(String customNID) {
		this.customNID = customNID;
	}



	public String getCustomDOB() {
		return customDOB;
	}



	public void setCustomDOB(String customDOB) {
		this.customDOB = customDOB;
	}



	public String getCustomFatherName() {
		return customFatherName;
	}



	public void setCustomFatherName(String customFatherName) {
		this.customFatherName = customFatherName;
	}



	public String getCustomMotherName() {
		return customMotherName;
	}



	public void setCustomMotherName(String customMotherName) {
		this.customMotherName = customMotherName;
	}



	public String getCustomAddr() {
		return customAddr;
	}



	public void setCustomAddr(String customAddr) {
		this.customAddr = customAddr;
	}



	public String getCustomPhoneNum() {
		return customPhoneNum;
	}



	public void setCustomPhoneNum(String customPhoneNum) {
		this.customPhoneNum = customPhoneNum;
	}



	public String getCustomAccountNum() {
		return customAccountNum;
	}



	public void setCustomAccountNum(String customAccountNum) {
		this.customAccountNum = customAccountNum;
	}

}