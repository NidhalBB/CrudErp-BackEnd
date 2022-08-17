package com.example.demo.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "etudeQantitative")
public class EtudeQuantitative {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id;
	@Column(name="domain")
	private String []  domain = {"VERRERIE","La Fonderie","Autres"};
	@Column(name="reserve")
	private double reserve;
	@Column(name="qualiteSi")
	private int qualiteSi;
	@Column(name="qualiteFe")
	private int qualiteFe;
	
	public EtudeQuantitative(String[] domain,int qualiteSi, int qualiteFe) {
		super();
		this.domain = domain;
		this.qualiteSi = qualiteSi;
		this.qualiteFe = qualiteFe;
	}
	public EtudeQuantitative() {}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getDomain() {
		return domain;
	}
	public void setDomain(String[] domain) {
		this.domain = domain;
	}
	public double getReserve() {
		return reserve;
	}
	public void setReserve(double reserve) {
		this.reserve = reserve;
	}
	public int getQualiteSi() {
		return qualiteSi;
	}
	public void setQualiteSi(int qualiteSi) {
		this.qualiteSi = qualiteSi;
	}
	public int getQualiteFe() {
		return qualiteFe;
	}
	public void setQualiteFe(int qualiteFe) {
		this.qualiteFe = qualiteFe;
	}

}
