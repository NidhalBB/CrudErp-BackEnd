package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "image_table")
public class ImageModel {

	@Id
  	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
  	@Column(name = "id")
    private String id;

  	@Column(name = "name")
    private String name;

  	@Column(name = "type")
    private String contentType;

  	@Column(name = "size")
    private Long size;

    @Lob
    @Column(name = "certif")
    private byte[] certif;
    
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public byte[] getCertif() {
        return certif;
    }

    public void setCertif(byte[] certif) {
        this.certif = certif;
    }
}
