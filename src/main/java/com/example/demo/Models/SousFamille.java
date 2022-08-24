package com.example.demo.Models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "sousFamilles")
public class SousFamille implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idSousFamille")
	private String id_SousFamille ;
	@Column(name="designation")
	private String designation;
	
	private String famille;
	
	public String getFamilleProduit() {
		return famille;
	}
	public void setFamilleProduit(String familleProduit) {
		this.famille = familleProduit;
	}
	public SousFamille() {}
	
	
	public SousFamille(String designation, String famille) {
		super();
		this.designation = designation;
		this.famille = famille;
	}
	public String getId_SousFamille() {
		return id_SousFamille;
	}
	public void setId_SousFamille(String id_SousFamille) {
		this.id_SousFamille = id_SousFamille;
	} 
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
