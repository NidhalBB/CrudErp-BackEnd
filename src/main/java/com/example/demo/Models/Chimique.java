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
@Table(name = "chimique")
public class Chimique {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name="ph")
	private double ph ;
	@Column(name="si")
	private double si ;
	@Column(name="fe")
	private double fe ;
	@Column(name="al")
	private double al ;
	@Column(name="quantite")
	private double quantite ;
	@Column(name="autre")
	private String autre ;
	@Column(name="sable")
	private double sable ;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drx", referencedColumnName = "id")
	private ImageModel drx;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ag", referencedColumnName = "id")
	private ImageModel ag;
	
	public Chimique() {}

	public Chimique(double ph, double si, double fe, double al, double quantite, String autre, double sable,
			ImageModel drx, ImageModel ag) {
		super();
		this.ph = ph;
		this.si = si;
		this.fe = fe;
		this.al = al;
		this.quantite = quantite;
		this.autre = autre;
		this.sable = sable;
		this.drx = drx;
		this.ag = ag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public double getSi() {
		return si;
	}

	public void setSi(double si) {
		this.si = si;
	}

	public double getFe() {
		return fe;
	}

	public void setFe(double fe) {
		this.fe = fe;
	}

	public double getAl() {
		return al;
	}

	public void setAl(double al) {
		this.al = al;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public String getAutre() {
		return autre;
	}

	public void setAutre(String autre) {
		this.autre = autre;
	}

	public double getSable() {
		return sable;
	}

	public void setSable(double sable) {
		this.sable = sable;
	}

	public ImageModel getDrx() {
		return drx;
	}

	public void setDrx(ImageModel drx) {
		this.drx = drx;
	}

	public ImageModel getAg() {
		return ag;
	}

	public void setAg(ImageModel ag) {
		this.ag = ag;
	}
	
	
	
}
