package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "postes")
public class Postes {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idPoste")
	private String id_poste ;

	@Column(name="poste")
	private String poste ;
	@Column(name="description")
	private String description ;
	
	public Postes() {}

	public Postes(String poste, String description) {
		super();
		this.poste = poste;
		this.description = description;
	}

	public String getId_poste() {
		return id_poste;
	}

	public void setId_poste(String id_poste) {
		this.id_poste = id_poste;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
