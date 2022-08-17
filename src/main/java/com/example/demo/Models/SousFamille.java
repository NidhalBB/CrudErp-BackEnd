package com.example.demo.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sousFamilles")
public class SousFamille {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idSousFamille")
	private String id_SousFamille ;
	@Column(name="designation")
	private String designation;
	@ManyToOne(cascade=CascadeType.ALL)
	private FamilleProduit familleProduit;
	
	public FamilleProduit getFamilleProduit() {
		return familleProduit;
	}
	public void setFamilleProduit(FamilleProduit familleProduit) {
		this.familleProduit = familleProduit;
	}
	@OneToMany(mappedBy = "sousfamille")
	private List<MatiereAcquise> matiereAcquise;
	
	public List<MatiereAcquise> getMatiereAcquise() {
		return matiereAcquise;
	}
	public void setMatiereAcquise(List<MatiereAcquise> matiereAcquise) {
		this.matiereAcquise = matiereAcquise;
	}
	public SousFamille() {}
	
	public SousFamille(String designation, FamilleProduit familleProduit, List<MatiereAcquise> matiereAcquise) {
		super();
		this.designation = designation;
	}
	public String getId_SousFamille() {
		return id_SousFamille;
	}
	public void setId_SousFamille(String id_SousFamille) {
		this.id_SousFamille = id_SousFamille;
	} 
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
