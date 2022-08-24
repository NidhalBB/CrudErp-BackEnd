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
	@Column(name="sousfamille")
	private String sousfamille;
	@Column(name="famille")
	private String famille;
	
	public ProduitSemiFini() {}

	

	public ProduitSemiFini(String designation, String sousfamille, String famille) {
		super();
		this.designation = designation;
		this.sousfamille = sousfamille;
		this.famille = famille;
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



	public String getSousfamille() {
		return sousfamille;
	}



	public void setSousfamille(String sousfamille) {
		this.sousfamille = sousfamille;
	}



	public String getFamille() {
		return famille;
	}



	public void setFamille(String famille) {
		this.famille = famille;
	}
	
	
}
