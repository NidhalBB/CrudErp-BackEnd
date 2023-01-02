package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "QuantiteMinier")
public class QuantiteMinier {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idMinier")
	private String id_Minier;
	@Column(name="nom")
	private String nom;
	@Column(name="substance")
	private String substance;
	@Column(name="quantite")
	private String quantite;
	@Column(name="valeur")
	private String valeur;
	@Column(name="droit")
	private String droit;
	
	public QuantiteMinier() {}

	public QuantiteMinier(String nom, String substance, String quantite, String valeur, String droit) {
		super();
		this.nom = nom;
		this.substance = substance;
		this.quantite = quantite;
		this.valeur = valeur;
		this.droit = droit;
	}

	public String getId_Minier() {
		return id_Minier;
	}

	public void setId_Minier(String id_Minier) {
		this.id_Minier = id_Minier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
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

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	}
	
	

}
