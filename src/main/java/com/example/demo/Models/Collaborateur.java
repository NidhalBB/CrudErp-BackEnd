package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "collaborateur")
public class Collaborateur {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idCollaborateur")
	private String id_collaborateur ;
	@Column(name="num")
	private String num;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="genre")
	private String genre;
	@Column(name="cnss")
	private String cnss;
	@Column(name="lieu")
	private String lieu;
	@Column(name="active")
	private String active;
	@Column(name="date")
	private Date date;
	
	public Collaborateur() {}

	public Collaborateur(String num, Date date ,String nom, String prenom, String genre, String cnss, String lieu, String active) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.cnss = cnss;
		this.lieu = lieu;
		this.active = active;
		this.date = date;
	}

	public String getId_collaborateur() {
		return id_collaborateur;
	}

	public void setId_collaborateur(String id_collaborateur) {
		this.id_collaborateur = id_collaborateur;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCnss() {
		return cnss;
	}

	public void setCnss(String cnss) {
		this.cnss = cnss;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
	

}
