package com.example.demo.Controllers;

import java.io.IOException;
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

import com.example.demo.Models.Fournisseur;
import com.example.demo.Repo.FournisseurRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FournisseurController {
	
	@Autowired(required=true)
	FournisseurRepo rep;

	@GetMapping("/showAllFournisseur")
	public List<Fournisseur> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createFournisseur",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Fournisseur add(@RequestBody  Fournisseur fournisseur ) throws IOException{
	    return this.rep.save(fournisseur);
    }
	@DeleteMapping("/Fournisseur/{id}")
	public void delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
	}
}
