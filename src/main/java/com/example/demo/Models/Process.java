package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "process")
public class Process {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idProcess")
	private String id_process ;
	@Column(name="designation")
	private String designation;
	@Column(name="num")
	private String num;
	@Column(name="operation")
	private String operation;
	
	public Process() {}

	public Process(String designation, String operation ,String num) {
		super();
		this.designation = designation;
		this.num = num;
		this.operation = operation ;
	}

	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getId_process() {
		return id_process;
	}

	public void setId_process(String id_process) {
		this.id_process = id_process;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
}
