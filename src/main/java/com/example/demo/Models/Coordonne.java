package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "coordonne")
public class Coordonne {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idcoordonne")
	private String id_coordonne ;
	@Column(name="matricule")
	private String matricule ;
	@Column(name="collaborateur")
	private String collaborateur ;
	@Column(name="email")
	private String email ;
	@Column(name="telephone")
	private String telephone ;
	@Column(name="adresse")
	private String adresse ;
	@Column(name="situation")
	private String situation ;
	
	public Coordonne () {}

	public Coordonne(String matricule, String collaborateur, String email, String telephone, String adresse,
			String situation) {
		super();
		this.matricule = matricule;
		this.collaborateur = collaborateur;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.situation = situation;
	}

	public String getId_coordonne() {
		return id_coordonne;
	}

	public void setId_coordonne(String id_coordonne) {
		this.id_coordonne = id_coordonne;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}
	
}
