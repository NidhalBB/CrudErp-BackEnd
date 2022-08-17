package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "produit")
public class Produit {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_Produit")
	private String id_Produit ;
	@Column(name="designation")
	private String designation;
	@Column(name="prix")
	private double prix;
	@Column(name="quantite")
	private double quantite;
	@Column(name="etat")
	private String etat;
	public String getId_Produit() {
		return id_Produit;
	}
	public void setId_Produit(String id_Produit) {
		this.id_Produit = id_Produit;
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
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public Produit() {}
	public Produit(String designation, double prix, double quantite, String etat) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
		this.etat = etat;
	}
	
}
