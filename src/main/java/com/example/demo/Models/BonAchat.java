package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bon_achat")
public class BonAchat {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name="dateD")
	private Date dateD ;
	@Column(name="demandeur")
	private String demandeur ;
	@Column(name="departement")
	private String departement ;
	@Column(name="nomFournisseur")
	private String nomFournisseur ;
	@Column(name="designation_produit")
	private String designation_produit ;
	@Column(name="quantite_article")
	private double quantite_article ;
	
	@Column(name="prix")
	private double prix ;
	
	@Column(name="montantHT")
	private double montantHT ;
	
	@Column(name="montantTTC")
	private double montantTTC ;
	
	public BonAchat() {}

	public BonAchat(Date dateD, String demandeur, String departement, String nomFournisseur, String designation_produit,
			double quantite_article, double prix, double montantHT, double montantTTC) {
		super();
		this.dateD = dateD;
		this.demandeur = demandeur;
		this.departement = departement;
		this.nomFournisseur = nomFournisseur;
		this.designation_produit = designation_produit;
		this.quantite_article = quantite_article;
		this.prix = prix;
		this.montantHT = montantHT;
		this.montantTTC = montantTTC;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateD() {
		return dateD;
	}

	public void setDateD(Date dateD) {
		this.dateD = dateD;
	}

	public String getDemandeur() {
		return demandeur;
	}

	public void setDemandeur(String demandeur) {
		this.demandeur = demandeur;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	public String getDesignation_produit() {
		return designation_produit;
	}

	public void setDesignation_produit(String designation_produit) {
		this.designation_produit = designation_produit;
	}

	public double getQuantite_article() {
		return quantite_article;
	}

	public void setQuantite_article(double quantite_article) {
		this.quantite_article = quantite_article;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	public double getMontantHT() {
		return montantHT;
	}

	public void setMontantHT(double montantHT) {
		this.montantHT = montantHT;
	}

	public double getMontantTTC() {
		return montantTTC;
	}

	public void setMontantTTC(double montantTTC) {
		this.montantTTC = montantTTC;
	}

}
