package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "labo")
public class Labo {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idLabo")
	private String id_labo ;
	@Column(name="designation")
	private String designation;
	@Column(name="address")
	private String address;
	@Column(name="tele")
	private String tele;
	@Column(name="prix")
	private double prix;
	
	public String getId_labo() {
		return id_labo;
	}
	public void setId_labo(String id_labo) {
		this.id_labo = id_labo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "echantillon", referencedColumnName = "id_echantillon")
    private Echantillon echantillon;
	
	public Echantillon getEchantillon() {
		return echantillon;
	}
	public void setEchantillon(Echantillon echantillon) {
		this.echantillon = echantillon;
	}
	public Labo() {}
	public Labo(String designation, String address, String tele, double prix, Echantillon echantillon) {
		super();
		this.designation = designation;
		this.address = address;
		this.tele = tele;
		this.prix = prix;
		this.echantillon = echantillon;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
