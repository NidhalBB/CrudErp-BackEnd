package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "equipements")
public class Equipements {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name="nom")
	private String nom;
	@Column(name="famille")
	private String famille;
	@Column(name="longueur")
	private double longueur;
	@Column(name="largeur")
	private double largeur;
	@Column(name="hauteur")
	private double hauteur;
	@Column(name="capacite")
	private double capacite;
	@Column(name="puissanceElectrique")
	private double puissanceElectrique;
	@Column(name="vitess")
	private double vitess;
	@Column(name="epaisseur")
	private double epaisseur;
	@Column(name="debit")
	private double debit;
	@Column(name="inclinaison")
	private double inclinaison;
	@Column(name="pression")
	private double pression;
	@Column(name="profondeur")
	private double profondeur;
	@Column(name="diametre")
	private double diametre;
	@Column(name="granulometrie")
	private double granulometrie;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public double getHauteur() {
		return hauteur;
	}
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	public double getPuissanceElectrique() {
		return puissanceElectrique;
	}
	public void setPuissanceElectrique(double puissanceElectrique) {
		this.puissanceElectrique = puissanceElectrique;
	}
	public double getVitess() {
		return vitess;
	}
	public void setVitess(double vitess) {
		this.vitess = vitess;
	}
	public double getEpaisseur() {
		return epaisseur;
	}
	public void setEpaisseur(double epaisseur) {
		this.epaisseur = epaisseur;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getInclinaison() {
		return inclinaison;
	}
	public void setInclinaison(double inclinaison) {
		this.inclinaison = inclinaison;
	}
	public double getPression() {
		return pression;
	}
	public void setPression(double pression) {
		this.pression = pression;
	}
	public double getProfondeur() {
		return profondeur;
	}
	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}
	public double getDiametre() {
		return diametre;
	}
	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}
	public double getGranulometrie() {
		return granulometrie;
	}
	public void setGranulometrie(double granulometrie) {
		this.granulometrie = granulometrie;
	}
	
	public String getFamille() {
		return famille;
	}
	public void setFamille(String famille) {
		this.famille = famille;
	}
	public Equipements(String nom, double longueur, double largeur, double hauteur, double capacite,
			double puissanceElectrique, double vitess, double epaisseur, double debit, double inclinaison,
			double pression, double profondeur, double diametre, double granulometrie , String famille) {
		super();
		this.nom = nom;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.capacite = capacite;
		this.puissanceElectrique = puissanceElectrique;
		this.vitess = vitess;
		this.epaisseur = epaisseur;
		this.debit = debit;
		this.inclinaison = inclinaison;
		this.pression = pression;
		this.profondeur = profondeur;
		this.diametre = diametre;
		this.granulometrie = granulometrie;
		this.famille = famille;
	}
	public Equipements() {}

}
