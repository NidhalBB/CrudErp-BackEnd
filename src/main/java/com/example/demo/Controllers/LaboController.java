package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Echantillon;
import com.example.demo.Models.Labo;
import com.example.demo.Models.ProduitOuvrage;
import com.example.demo.Repo.EchantillonRepo;
import com.example.demo.Repo.LaboRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LaboController {
	
	@Autowired(required=true)
	LaboRepo rep ;

	@GetMapping("/showAllLabo")
	public List<Labo> getAll(){
	    List <Labo> labo = this.rep.findAll();
	    return labo;
	}
	@RequestMapping(value = "/createlabo",method = RequestMethod.POST)
    public Labo create(@RequestBody Labo labo){
		
	  try {
		   this.rep.save(labo);
        return labo ; }
	  catch(Exception E){
		  return labo ;
	  }
    }
	
	@DeleteMapping("/labo/{id}")
	public void delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);	
	}
}
