package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "magasins")
public class Magasins {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idMagasins")
	private String id_Magasins ;
	@Column(name="designation")
	private String designation;
	@Column(name="hauteur")
	private double hauteur;
	@Column(name="largeur ")
	private double largeur ;
	@Column(name="longueur")
	private double longueur;

	@ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "familleProduit", referencedColumnName = "idFamilleProduit")
	private FamilleProduit familleProduit;

	public Magasins(String designation, double hauteur, double largeur, double longueur,
			FamilleProduit familleProduit) {
		super();
		this.designation = designation;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.longueur = longueur;
		this.familleProduit = familleProduit;
	}
	public Magasins() {}
	public String getId_Magasins() {
		return id_Magasins;
	}
	public void setId_Magasins(String id_Magasins) {
		this.id_Magasins = id_Magasins;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public FamilleProduit getFamilleProduit() {
		return familleProduit;
	}
	public void setFamilleProduit(FamilleProduit familleProduit) {
		this.familleProduit = familleProduit;
	}
	
	
}
