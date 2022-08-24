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
@Table(name = "echnatilonnage")
public class Echnatilonnage {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "autorisation ", referencedColumnName = "id")
	private ImageModel autorisation ;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "approbation  ", referencedColumnName = "id")
	private ImageModel approbation ;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "construction  ", referencedColumnName = "id")
	private ImageModel construction ;
	
	public Echnatilonnage() {
	}

	public ImageModel getAutorisation() {
		return autorisation;
	}

	public void setAutorisation(ImageModel autorisation) {
		this.autorisation = autorisation;
	}

	public ImageModel getApprobation() {
		return approbation;
	}

	public void setApprobation(ImageModel approbation) {
		this.approbation = approbation;
	}

	public ImageModel getConstruction() {
		return construction;
	}

	public void setConstruction(ImageModel construction) {
		this.construction = construction;
	}

	public Echnatilonnage(ImageModel autorisation, ImageModel approbation, ImageModel construction) {
		super();
		this.autorisation = autorisation;
		this.approbation = approbation;
		this.construction = construction;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
