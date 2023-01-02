package com.example.demo.Models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "famille")
public class Famille implements Serializable{

	
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(generator="system-uuid")
		@GenericGenerator(name="system-uuid", strategy = "uuid")
		@Column(name="id_Famille")
		private String id_Famille ;
		@Column(name="designationfamille")
		private String designation_famille;
		
		@OneToMany(mappedBy="sousFamille" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<SousFamille> sousFamilles;
		
		@OneToMany(mappedBy="produitSemiFini" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<ProduitSemiFini> produitSemiFinis;
		
		@OneToMany(mappedBy="produitOuvrage" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<ProduitOuvrage> produitOuvrages;
		
		@OneToMany(mappedBy="matiereAcquise" , fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	    private Set<MatiereAcquise> matiereAcquises;
		
		public Famille() {}

		public Famille(String designation_famille) {
			super();
			this.designation_famille = designation_famille;
		}

		public String getId_Famille() {
			return id_Famille;
		}

		public void setId_Famille(String id_Famille) {
			this.id_Famille = id_Famille;
		}

		public String getDesignation_famille() {
			return designation_famille;
		}

		public void setDesignation_famille(String designation_famille) {
			this.designation_famille = designation_famille;
		}
		
		
	}
