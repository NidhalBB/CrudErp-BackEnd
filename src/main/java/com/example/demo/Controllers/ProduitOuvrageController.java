package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.ProduitOuvrage;
import com.example.demo.Repo.ProduitOuvrageRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProduitOuvrageController {

	@Autowired(required=true)
	ProduitOuvrageRepo rep ;


	@GetMapping("/showAllproduitOuvrage")
	public List<ProduitOuvrage> getAll(){
	    List <ProduitOuvrage> produitOuvrage = this.rep.findAll();
	    return produitOuvrage;
	}
	
@RequestMapping(value = "/createproduitOuvrage",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public ProduitOuvrage add(@RequestBody  ProduitOuvrage produitOuvrage ){
		  return this.rep.save(produitOuvrage);
      
    }

@DeleteMapping("/produitOuvrage/{id}")
public void delete(@PathVariable("id") String id) {
	this.rep.deleteById(id);	
}
}
