package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "parametreGeo")
public class ParametreGeo {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name="substance")
	private String substance;
	@Column(name="superficie")
	private double superficie;
	@Column(name="formationExploitee")
	private String formationExploite;
	@Column(name="age")
	private String age;
	@Column(name="epaisseur")
	private double epaisseur;
	@Column(name="densite")
	private float densite;
	@Column(name="couleur")
	private String couleur;
	@Column(name="volume")
	private double volume;
	@Column(name="reserve")
	private double reserve;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	public String getFormationExploite() {
		return formationExploite;
	}
	public void setFormationExploite(String formationExploite) {
		this.formationExploite = formationExploite;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public double getEpaisseur() {
		return epaisseur;
	}
	public void setEpaisseur(double epaisseur) {
		this.epaisseur = epaisseur;
	}
	public float getDensite() {
		return densite;
	}
	public void setDensite(float densite) {
		this.densite = densite;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getReserve() {
		return reserve;
	}
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
	public ImageModel getCarte() {
		return carte;
	}
	public void setCarte(ImageModel carte) {
		this.carte = carte;
	}
	public ParametreGeo(String substance, double superficie, String formationExploite, String age, double epaisseur,
			float densite, String couleur, ImageModel carte) {
		super();
		this.substance = substance;
		this.superficie = superficie;
		this.formationExploite = formationExploite;
		this.age = age;
		this.epaisseur = epaisseur;
		this.densite = densite;
		this.couleur = couleur;
	}
	public ParametreGeo() {}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "carte", referencedColumnName = "id")
	private ImageModel carte;

}
