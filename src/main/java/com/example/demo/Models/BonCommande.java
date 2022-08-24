package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bon_commande")
public class BonCommande {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name="destinataire")
	private String destinataire ;
	@Column(name="adresse")
	private String adresse ;
	@Column(name="dateC")
	private Date dateC ;
	@Column(name="dateL")
	private Date dateL ;
	@Column(name="matricule")
	private int matricule ;
	
	public BonCommande() {}

	public BonCommande(String destinataire, String adresse, Date dateC, Date dateL, int matricule) {
		super();
		this.destinataire = destinataire;
		this.adresse = adresse;
		this.dateC = dateC;
		this.dateL = dateL;
		this.matricule = matricule;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateC() {
		return dateC;
	}

	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}

	public Date getDateL() {
		return dateL;
	}

	public void setDateL(Date dateL) {
		this.dateL = dateL;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	
	
	
	
}
