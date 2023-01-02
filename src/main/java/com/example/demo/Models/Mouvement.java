package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mouvement")
public class Mouvement {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idmouvement")
	private String id_mouvement ;
	@Column(name="num")
	private String num;
	@Column(name="date")
	private Date date;
	@Column(name="code")
	private String code;
	@Column(name="client")
	private String client;
	@Column(name="fournisseur")
	private String fournisseur;
	@Column(name="type")
	private String type;
	@Column(name="quantite")
	private String quantite;
	@Column(name="cout")
	private String cout;
	
	public Mouvement () {}

	public Mouvement(String num, Date date, String code, String client, String fournisseur, String type,
			String quantite, String cout) {
		super();
		this.num = num;
		this.date = date;
		this.code = code;
		this.client = client;
		this.fournisseur = fournisseur;
		this.type = type;
		this.quantite = quantite;
		this.cout = cout;
	}

	public String getId_mouvement() {
		return id_mouvement;
	}

	public void setId_mouvement(String id_mouvement) {
		this.id_mouvement = id_mouvement;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}
	
}
