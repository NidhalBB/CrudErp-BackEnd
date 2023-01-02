package com.example.demo.Models;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "sousFamilles")
public class SousFamille implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idSousFamille")
	private String id_SousFamille ;
	@Column(name="designation")
	private String designation;
	
	 @ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	    @JoinColumn(name="sousFamille_id", nullable=false)
	    private Famille sousFamille;
	
	 	@OneToMany(mappedBy="pSemiFini" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<ProduitSemiFini> pSemiFinis;
		
		@OneToMany(mappedBy="pOuvrage" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<ProduitOuvrage> pOuvrages;
		
		@OneToMany(mappedBy="mAcquise" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<MatiereAcquise> mAcquises;
		
	 
	public SousFamille() {}
	
	
	
	public SousFamille(String designation, Famille sousFamille) {
		super();
		this.designation = designation;
		this.sousFamille = sousFamille;
	}



	public Famille getSousFamille() {
		return sousFamille;
	}



	public void setSousFamille(Famille sousFamille) {
		this.sousFamille = sousFamille;
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
