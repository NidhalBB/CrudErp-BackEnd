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
@Table(name = "ProduitSemiFini")
public class ProduitSemiFini {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idProduitSemiFini")
	private String id_Produit_Semi_Fini ;
	@Column(name="designation")
	private String designation;
	@ManyToOne
	 @Cascade(CascadeType.SAVE_UPDATE)
	    @JoinColumn(name="pSemiFini_id", nullable=false)
	    private SousFamille pSemiFini;
	
	 @ManyToOne
	 @Cascade(CascadeType.SAVE_UPDATE)
	    @JoinColumn(name="produitSemiFini_id", nullable=false)
	    private Famille produitSemiFini;
	
	public ProduitSemiFini() {}

	





	public ProduitSemiFini(String id_Produit_Semi_Fini, String designation, SousFamille pSemiFini,
			Famille produitSemiFini) {
		super();
		this.id_Produit_Semi_Fini = id_Produit_Semi_Fini;
		this.designation = designation;
		this.pSemiFini = pSemiFini;
		this.produitSemiFini = produitSemiFini;
	}







	public Famille getProduitSemiFini() {
		return produitSemiFini;
	}




	public void setProduitSemiFini(Famille produitSemiFini) {
		this.produitSemiFini = produitSemiFini;
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

	public SousFamille getpSemiFini() {
		return pSemiFini;
	}

	public void setpSemiFini(SousFamille pSemiFini) {
		this.pSemiFini = pSemiFini;
	}


	
}
