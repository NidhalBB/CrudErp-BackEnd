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

import com.example.demo.Models.BonCommande;
import com.example.demo.Repo.BonCommandeRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BonCommandeController {

	@Autowired(required=true)
	BonCommandeRepo rep ;

	@GetMapping("/showAllBonCommande")
	public List<BonCommande> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createBonCommande",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public BonCommande add(@RequestBody  BonCommande bonCommande ) throws IOException{
	    return this.rep.save(bonCommande);
    }
}
