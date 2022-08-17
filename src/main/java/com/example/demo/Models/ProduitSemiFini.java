package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ProduitSemiFini")
public class ProduitSemiFini {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idProduitSemiFini")
	private String id_Produit_Semi_Fini ;
	@Column(name="designation")
	private String designation;
	@OneToOne
    @JoinColumn(name = "idFamilleProduit", referencedColumnName = "idFamilleProduit")
	private FamilleProduit familleProduit;
	@OneToOne
    @JoinColumn(name = "idSousFamille", referencedColumnName = "idSousFamille")
	private SousFamille sousfamille;
	
	public ProduitSemiFini() {}

	public ProduitSemiFini(String designation, FamilleProduit familleProduit, SousFamille sousfamille) {
		super();
		this.designation = designation;
		this.familleProduit = familleProduit;
		this.sousfamille = sousfamille;
	}

	public String getId_Produit_Semi_Fini() {
		return id_Produit_Semi_Fini;
	}

	public void setId_Produit_Semi_Fini(String id_Produit_Semi_Fini) {
		this.id_Produit_Semi_Fini = id_Produit_Semi_Fini;
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
	
	
}
