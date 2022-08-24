package com.example.demo.Models;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "operation")
public class Operation {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idOperation")
	private String id_operation ;
	@Column(name="designation")
	private String designation;
	@Column(name="etat")
	private String etat;
	@Column(name="machine")
	private String machine;
	@Column(name="temps")
	private LocalTime temps;
	public String getId_operation() {
		return id_operation;
	}
	public void setId_operation(String id_operation) {
		this.id_operation = id_operation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public LocalTime getTemps() {
		return temps;
	}
	public void setTemps(LocalTime temps) {
		this.temps = temps;
	}
	
	public Operation() {}
	public Operation(String designation, String etat, String machine, LocalTime temps) {
		super();
		this.designation = designation;
		this.etat = etat;
		this.machine = machine;
		this.temps = temps;
	}
	
}
