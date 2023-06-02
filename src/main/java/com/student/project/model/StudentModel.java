package com.student.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentModel {
	@Id
	private Integer id;
	
	private String name;
	
	private String address;
	
	private String branch;
	
	private String college;
	
	public StudentModel() {
		super();
	}

	public StudentModel(Integer id, String name, String address, String branch, String college) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.branch = branch;
		this.college = college;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
	
	
}
