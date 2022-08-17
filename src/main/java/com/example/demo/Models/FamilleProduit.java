package com.example.demo.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "familleProduit")
public class FamilleProduit {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idFamilleProduit")
	private String id_FamilleProduit ;
	@Column(name="designation") 
	private String designation;
	@OneToMany(mappedBy = "id_Magasins")
	private List<Magasins> magasins;
	@OneToMany(mappedBy = "familleProduit")
	private List<MatiereAcquise> matiereAcquise;
	@OneToMany(mappedBy = "familleProduit" , cascade=CascadeType.ALL)
	@JsonIgnore
	private List<SousFamille> sousFamille;
	
	public List<SousFamille> getSousFamille() {
		return sousFamille;
	}
	public void setSousFamille(List<SousFamille> sousFamille) {
		this.sousFamille = sousFamille;
	}
	public List<MatiereAcquise> getMatiereAcquise() {
		return matiereAcquise;
	}
	public void setMatiereAcquise(List<MatiereAcquise> matiereAcquise) {
		this.matiereAcquise = matiereAcquise;
	}
	public List<Magasins> getMagasins() {
		return magasins;
	}
	
	public void setMagasins(List<Magasins> magasins) {
		this.magasins = magasins;
	}
	public FamilleProduit() {}
	public FamilleProduit(String designation) {
		super();
		this.designation = designation;
	}
	public String getId_FamilleProduit() {
		return id_FamilleProduit;
	}
	public void setId_FamilleProduit(String id_FamilleProduit) {
		this.id_FamilleProduit = id_FamilleProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
