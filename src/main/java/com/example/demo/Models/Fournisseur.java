package com.example.demo.Models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "fournisseur")
public class Fournisseur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_fournisseur")
	private String id ;
	@Column(name="designation")
	private String designation;
	@Column(name="adresse")
	private String adresse;
	@Column(name="tele")
	private String tele;
	@OneToMany(mappedBy = "fournisseur", fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Set <MatiereAcquise> matiereAcquise;


	public Fournisseur(String designation, String adresse, String tele) {
		super();
		this.designation = designation;
		this.adresse = adresse;
		this.tele = tele;
	}
	
	public Fournisseur() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}
	
}
