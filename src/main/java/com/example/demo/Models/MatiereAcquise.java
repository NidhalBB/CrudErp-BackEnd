package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "MatiereAcquise")
public class MatiereAcquise {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_Matiere")
	private String id_Matiere ;
	@Column(name="designation")
	private String designation;
	@Column(name="fournisseur")
	private String fournisseur;
	@Column(name="sousfamille")
	private String sousfamille;
	@Column(name="famille")
	private String famille;
	@Column(name="prix")
	private double prix;
	@Column(name="quantite")
	private double quantite;
	
	public MatiereAcquise() {}

	public String getId_Magasins() {
		return id_Matiere;
	}

	public void setId_Magasins(String id_Matiere) {
		this.id_Matiere = id_Matiere;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public String getId_Matiere() {
		return id_Matiere;
	}

	public void setId_Matiere(String id_Matiere) {
		this.id_Matiere = id_Matiere;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
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

	public MatiereAcquise(String designation, String fournisseur, String sousfamille, String famille, double prix,
			double quantite) {
		super();
		this.designation = designation;
		this.fournisseur = fournisseur;
		this.sousfamille = sousfamille;
		this.famille = famille;
		this.prix = prix;
		this.quantite = quantite;
	}

	
	
}
