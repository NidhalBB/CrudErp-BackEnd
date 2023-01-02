package com.example.demo.Models;

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
	@Column(name="machine")
	private String machine;
	@Column(name="temps")
	private String temps;

	@Column(name="type")
	private String type;
	@Column(name="poste")
	private String poste;
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
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	
	public String getTemps() {
		return temps;
	}
	public void setTemps(String temps) {
		this.temps = temps;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public Operation() {}
	public Operation(String designation, String machine, String temps, String type, String poste) {
		super();
		this.designation = designation;
		this.machine = machine;
		this.temps = temps;
		this.type = type;
		this.poste = poste;
	}
	
	
}
