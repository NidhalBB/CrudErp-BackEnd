package com.example.demo.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "commandeClient")
public class CommandeClient {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="idCommandeClient")
	private String idCommande_client ;
	@Column(name="dateCommande")
	private Date dateC ;
	@Column(name="dateLivrison")
	private Date dateL ;

}
