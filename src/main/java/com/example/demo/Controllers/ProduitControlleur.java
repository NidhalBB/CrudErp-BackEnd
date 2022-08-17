package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Produit;
import com.example.demo.Repo.ProduitRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProduitControlleur {

	@Autowired(required=true)
	ProduitRepo rep;

	@GetMapping("/showAllProduit")
	public List<Produit> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createProduit",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Produit add(@RequestBody  Produit produit ) throws IOException{
	    return this.rep.save(produit);
    }

}
