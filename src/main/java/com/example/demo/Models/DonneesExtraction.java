package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "DonneesExtraction")
public class DonneesExtraction {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idDonnee")
	private String id_Donee;
	@Column(name="substance")
	private String substance;
	@Column(name="quantite")
	private String quantite;
	@Column(name="methode")
	private String methode;
	@Column(name="duree")
	private String duree;
	@Column(name="periode")
	private String periode;
	
	public DonneesExtraction() {}

	public DonneesExtraction(String substance, String quantite, String methode, String duree, String periode) {
		super();
		this.substance = substance;
		this.quantite = quantite;
		this.methode = methode;
		this.duree = duree;
		this.periode = periode;
	}

	public String getId_Donee() {
		return id_Donee;
	}

	public void setId_Donee(String id_Donee) {
		this.id_Donee = id_Donee;
	}

	public String getSubstance() {
		return substance;
	}

	public void setSubstance(String substance) {
		this.substance = substance;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getMethode() {
		return methode;
	}

	public void setMethode(String methode) {
		this.methode = methode;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}
	
	

}
