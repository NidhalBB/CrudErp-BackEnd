package com.example.demo.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name = "echantillon")
public class Echantillon{
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id_echantillon")
	private String id ;
	@Column(name="numEchantillon")
	private int numEchantillon;
	@Column(name="tauxSi")
	private int tauxSi;
	@Column(name="quantite")
	private int quantite;
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Column(name="tauxFe")
	private int tauxFe;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ag", referencedColumnName = "id")
	private ImageModel ag;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="dateE")
	private Date dateE;
	
	public Date getDateE() {
		return dateE;
	}



	public void setDateE(Date dateE) {
		this.dateE = dateE;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="dateP")
	private Date dateP;
	
	public Date getDateP() {
		return dateP;
	}



	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}



	public Echantillon() {}
	
	
	


	public String getId() {
		return id;
	}
	@JsonCreator
	public Echantillon(int numEchantillon, int tauxSi, int quantite, int tauxFe, ImageModel ag, Date dateE, Date dateP,
			String designationlabo) {
		super();
		this.numEchantillon = numEchantillon;
		this.tauxSi = tauxSi;
		this.quantite = quantite;
		this.tauxFe = tauxFe;
		this.ag = ag;
		this.dateE = dateE;
		this.dateP = dateP;
		this.designationlabo = designationlabo;
	}
	public void setId(String id) {
		this.id = id;
	}

	public int getTauxSi() {
		return tauxSi;
	}

	public void setTauxSi(int tauxSi) {
		this.tauxSi = tauxSi;
	}

	public int getTauxFe() {
		return tauxFe;
	}

	public void setTauxFe(int tauxFe) {
		this.tauxFe = tauxFe;
	}

	public ImageModel getAg() {
		return ag;
	}

	public void setAg(ImageModel ag) {
		this.ag = ag;
	}
	
	@Column(name="designationlabo")
    private String designationlabo;
	public int getNumEchantillon() {
		return numEchantillon;
	}
	public void setNumEchantillon(int numEchantillon) {
		this.numEchantillon = numEchantillon;
	}
	public String getDesignationlabo() {
		return designationlabo;
	}
	public void setDesignationlabo(String designationlabo) {
		this.designationlabo = designationlabo;
	}
	
	
	
}
