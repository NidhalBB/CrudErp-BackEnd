package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ProduitOuvrage")
public class ProduitOuvrage {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idProduitOuvrage")
	private String id_Produit_Ouvrage;
	@Column(name="designation")
	private String designation;
	@Column(name="sousfamille")
	private String sousfamille;
	@Column(name="famille")
	private String famille;
	
	public ProduitOuvrage() {}

	public String getId_Produit_Ouvrage() {
		return id_Produit_Ouvrage;
	}

	public void setId_Produit_Ouvrage(String id_Produit_Ouvrage) {
		this.id_Produit_Ouvrage = id_Produit_Ouvrage;
	}

	public String getDesignation() {
		return designation;
	} 

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSousfamille() {
		return sousfamille;
	}

	public void setSousfamille(String sousfamille) {
		this.sousfamille = sousfamille;
	}

	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public ProduitOuvrage(String designation, String sousfamille, String famille) {
		super();
		this.designation = designation;
		this.sousfamille = sousfamille;
		this.famille = famille;
	}
	

}
