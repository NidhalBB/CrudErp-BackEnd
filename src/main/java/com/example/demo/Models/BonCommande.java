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
	@Column(name="nomFournisseur")
	private String nomFournisseur ;
	@Column(name="designation_produit")
	private String designation_produit ;
	@Column(name="dateC")
	private Date dateC ;
	@Column(name="dateP")
	private Date dateP ;
	@Column(name="quantite_article")
	private Date quantite_article ;
	
	public BonCommande(String nomFournisseur, String designation_produit, Date dateC, Date dateP,
			Date quantite_article) {
		super();
		this.nomFournisseur = nomFournisseur;
		this.designation_produit = designation_produit;
		this.dateC = dateC;
		this.dateP = dateP;
		this.quantite_article = quantite_article;
	}
	public BonCommande() {}
	public BonCommande(String id, String nomFournisseur, String designation_produit, Date dateC, Date dateP,
			Date quantite_article) {
		super();
		this.id = id;
		this.nomFournisseur = nomFournisseur;
		this.designation_produit = designation_produit;
		this.dateC = dateC;
		this.dateP = dateP;
		this.quantite_article = quantite_article;
	}
	
	
	
	
	
	
	
}
