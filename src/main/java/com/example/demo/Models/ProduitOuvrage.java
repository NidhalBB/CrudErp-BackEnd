package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@ManyToOne
    @JoinColumn(name = "familleProduit", referencedColumnName = "idFamilleProduit")
	private FamilleProduit familleProduit;
	@ManyToOne
    @JoinColumn(name = "sousfamille", referencedColumnName = "idSousFamille")
	private SousFamille sousfamille;
	
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

	public FamilleProduit getFamilleProduit() {
		return familleProduit;
	}

	public void setFamilleProduit(FamilleProduit familleProduit) {
		this.familleProduit = familleProduit;
	}

	public SousFamille getSousfamille() {
		return sousfamille;
	}

	public void setSousfamille(SousFamille sousfamille) {
		this.sousfamille = sousfamille;
	}

	public ProduitOuvrage(String designation, FamilleProduit familleProduit, SousFamille sousfamille) {
		super();
		this.designation = designation;
		this.familleProduit = familleProduit;
		this.sousfamille = sousfamille;
	}
	

}
