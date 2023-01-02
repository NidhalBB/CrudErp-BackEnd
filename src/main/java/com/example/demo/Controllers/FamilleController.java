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

import com.example.demo.Models.Famille;
import com.example.demo.Repo.FamilleRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FamilleController {
	
	@Autowired(required=true)
	FamilleRepo rep;
	

	@GetMapping("/showAllfamilleProduit")
    public List<Famille> getAll(){
        List <Famille> familleProduit = this.rep.findAll();
        return familleProduit;
    }
@RequestMapping(value = "/createfamilleProduits",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Famille add(@RequestBody  Famille familleProduit ){
		
	  try {
		  Famille fp = rep.save(familleProduit);
        return fp ; }
	  catch(Exception E){
		  return null ;
	  }
    }

@DeleteMapping("/Famille/{id}")
public void delete(@PathVariable("id") String id) {
	this.rep.deleteById(id);	
}

}
