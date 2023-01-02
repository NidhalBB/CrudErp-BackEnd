package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "competance")
public class Competance {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idCompetance")
	private String id_competance ;
	@Column(name="matricule")
	private String matricule ;
	@Column(name="collaborateur")
	private String collaborateur ;
	@Column(name="description")
	private String description ;
	@Column(name="type")
	private String type ;
	
	public Competance() {}

	public Competance(String matricule, String collaborateur, String description, String type) {
		super();
		this.matricule = matricule;
		this.collaborateur = collaborateur;
		this.description = description;
		this.type = type;
	}

	public String getId_competance() {
		return id_competance;
	}

	public void setId_competance(String id_competance) {
		this.id_competance = id_competance;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(String collaborateur) {
		this.collaborateur = collaborateur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
