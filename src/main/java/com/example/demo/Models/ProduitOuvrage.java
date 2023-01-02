package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
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
	@ManyToOne
	 @Cascade(CascadeType.DELETE)
	    @JoinColumn(name="pOuvrage_id", nullable=false)
	    private SousFamille pOuvrage;
	
	@ManyToOne
	 @Cascade(CascadeType.DELETE)
	    @JoinColumn(name="produitOuvrage_id", nullable=false)
	    private Famille produitOuvrage;
	@Column(name="quantite")
	private double quantite;
	@Column(name="prix")
	private double prix;
	
	
	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

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


	public SousFamille getpOuvrage() {
		return pOuvrage;
	}

	public void setpOuvrage(SousFamille pOuvrage) {
		this.pOuvrage = pOuvrage;
	}

	public Famille getProduitOuvrage() {
		return produitOuvrage;
	}

	public void setProduitOuvrage(Famille produitOuvrage) {
		this.produitOuvrage = produitOuvrage;
	}

	public ProduitOuvrage(String id_Produit_Ouvrage, String designation, SousFamille pOuvrage, Famille produitOuvrage,
			double quantite, double prix) {
		super();
		this.id_Produit_Ouvrage = id_Produit_Ouvrage;
		this.designation = designation;
		this.pOuvrage = pOuvrage;
		this.produitOuvrage = produitOuvrage;
		this.quantite = quantite;
		this.prix = prix;
	}

	

}
