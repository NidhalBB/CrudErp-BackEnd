package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idClient")
	private String id_client ;
	@Column(name="designation")
	private String designation;
	@Column(name="address")
	private String address;
	@Column(name="tele")
	private String tele;
	@Column(name="compte")
	private String compte;
	@Column(name="conditionPaiement")
	private String conditionPaiement;
	@Column(name="siege")
	private String siege;
	@Column(name="societe")
	private String societe;
	@Column(name="codepostal")
	private String codepostale;
	@Column(name="pays")
	private String pays;
	@Column(name="ville")
	private String ville;
	@Column(name="teleSociete")
	private String teleSociete;
	public String getId_client() {
		return id_client;
	}
	public void setId_client(String id_client) {
		this.id_client = id_client;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	public Client() {}
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
	public String getConditionPaiement() {
		return conditionPaiement;
	}
	public void setConditionPaiement(String conditionPaiement) {
		this.conditionPaiement = conditionPaiement;
	}
	public String getSiege() {
		return siege;
	}
	public void setSiege(String siege) {
		this.siege = siege;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getCodepostale() {
		return codepostale;
	}
	public void setCodepostale(String codepostale) {
		this.codepostale = codepostale;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTeleSociete() {
		return teleSociete;
	}
	public void setTeleSociete(String teleSociete) {
		this.teleSociete = teleSociete;
	}
	public Client(String designation, String address, String tele, String compte, String conditionPaiement, String siege,
			String societe,String ville, String codepostale, String pays, String teleSociete) {
		super();
		this.designation = designation;
		this.address = address;
		this.tele = tele;
		this.compte = compte;
		this.conditionPaiement = conditionPaiement;
		this.siege = siege;
		this.societe = societe;
		this.ville = ville;
		this.codepostale = codepostale;
		this.pays = pays;
		this.teleSociete = teleSociete;
	}
}
