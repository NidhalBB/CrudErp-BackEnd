package com.example.demo.Models;

import java.io.Serializable;

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
@Table(name = "MatiereAcquise")
public class MatiereAcquise implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_Matiere")
	private String id_Matiere ;
	@Column(name="designation")
	private String designation;
	@ManyToOne
	 @Cascade(CascadeType.SAVE_UPDATE)
	    @JoinColumn(name="fournisseur_id", nullable=false)
	    private Fournisseur fournisseur;
	
	@ManyToOne
	 @Cascade(CascadeType.SAVE_UPDATE)
	    @JoinColumn(name="mAcquise_id", nullable=false)
	    private SousFamille mAcquise;
	
	@ManyToOne
	 @Cascade(CascadeType.SAVE_UPDATE)
	    @JoinColumn(name="matiereAcquise_id", nullable=false)
	    private Famille matiereAcquise;
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

	public String getId_Matiere() {
		return id_Matiere;
	}

	public void setId_Matiere(String id_Matiere) {
		this.id_Matiere = id_Matiere;
	}

	
	public Famille getMatiereAcquise() {
		return matiereAcquise;
	}

	public void setMatiereAcquise(Famille matiereAcquise) {
		this.matiereAcquise = matiereAcquise;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public SousFamille getmAcquise() {
		return mAcquise;
	}

	public void setmAcquise(SousFamille mAcquise) {
		this.mAcquise = mAcquise;
	}

	public MatiereAcquise(String id_Matiere, String designation, Fournisseur fournisseur, SousFamille mAcquise,
			Famille matiereAcquise, double prix, double quantite) {
		super();
		this.id_Matiere = id_Matiere;
		this.designation = designation;
		this.fournisseur = fournisseur;
		this.mAcquise = mAcquise;
		this.matiereAcquise = matiereAcquise;
		this.prix = prix;
		this.quantite = quantite;
	}

	
}
