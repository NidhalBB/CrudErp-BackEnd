package com.example.demo.Models;

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
@Table(name = "MatiereAcquise")
public class MatiereAcquise {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_Matiere")
	private String id_Matiere ;
	@Column(name="designation")
	private String designation;
	@ManyToOne
	private FamilleProduit familleProduit;
	@ManyToOne
	private Fournisseur fournisseur;
	@ManyToOne
	private SousFamille sousfamille;
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

	public FamilleProduit getFamilleProduit() {
		return familleProduit;
	}

	public void setFamilleProduit(FamilleProduit familleProduit) {
		this.familleProduit = familleProduit;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public SousFamille getSousfamille() {
		return sousfamille;
	}

	public void setSousfamille(SousFamille sousfamille) {
		this.sousfamille = sousfamille;
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

	public MatiereAcquise(String designation, FamilleProduit familleProduit, Fournisseur fournisseur,
			SousFamille sousfamille, double prix, double quantite) {
		super();
		this.designation = designation;
		this.familleProduit = familleProduit;
		this.fournisseur = fournisseur;
		this.sousfamille = sousfamille;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	
}
