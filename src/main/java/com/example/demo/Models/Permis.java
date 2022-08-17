package com.example.demo.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "permis")
public class Permis {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id")
	private String id ;
	@Column(name = "permisRecherche")
	private String permisRecherche;
	@Column(name = "permisEchantillon")
	private String permisEchantillon;
	@Column(name = "permisExploration")
	private String permisExploration;
	
	@Column(name="files")
    @ElementCollection(targetClass=String.class)
	private List<String> files;
	
	
	public Permis(String permisRecherche, String permisEchantillon, String permisExploration , List<String> files) {
		super();
		this.permisRecherche = permisRecherche;
		this.permisEchantillon = permisEchantillon;
		this.permisExploration = permisExploration;
		this.files = files;
	}


	public List<String> getFiles() {
		return files;
	}


	public void setFiles(List<String> files) {
		this.files = files;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPermisRecherche() {
		return permisRecherche;
	}


	public void setPermisRecherche(String permisRecherche) {
		this.permisRecherche = permisRecherche;
	}


	public String getPermisEchantillon() {
		return permisEchantillon;
	}


	public void setPermisEchantillon(String permisEchantillon) {
		this.permisEchantillon = permisEchantillon;
	}


	public String getPermisExploration() {
		return permisExploration;
	}


	public void setPermisExploration(String permisExploration) {
		this.permisExploration = permisExploration;
	}


	public Permis() {}

	
}
