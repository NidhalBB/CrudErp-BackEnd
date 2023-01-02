package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "commandeClient")
public class CommandeClient {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idCommandeClient")
	private String idCommande_client ;
	@Column(name="numCommande")
	private String numCommande ;
	@Column(name="dateCommande")
	private Date dateD ;
	@Column(name="dateLivrison")
	private Date dateL ;
	@Column(name="designation_client")
	private String designation_client ;
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
	
	public CommandeClient() {}

	public String getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(String numCommande) {
		this.numCommande = numCommande;
	}

	public Date getDateD() {
		return dateD;
	}

	public void setDateD(Date dateC) {
		this.dateD = dateC;
	}

	public Date getDateL() {
		return dateL;
	}

	public void setDateL(Date dateL) {
		this.dateL = dateL;
	}

	public String getDesignation_client() {
		return designation_client;
	}

	public void setDesignation_client(String designation_client) {
		this.designation_client = designation_client;
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

	public String getIdCommande_client() {
		return idCommande_client;
	}

	public void setIdCommande_client(String idCommande_client) {
		this.idCommande_client = idCommande_client;
	}

	public CommandeClient(String numCommande, String nomClient, Date dateC, Date dateL, String designation_client,
			String designation_produit, double quantite_article, double prix, double montantHT, double montantTTC) {
		super();
		this.numCommande = numCommande;
		this.dateD = dateC;
		this.dateL = dateL;
		this.designation_client = designation_client;
		this.designation_produit = designation_produit;
		this.quantite_article = quantite_article;
		this.prix = prix;
		this.montantHT = montantHT;
		this.montantTTC = montantTTC;
	}
	
	
	
}
