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

import com.example.demo.Models.ProduitSemiFini;
import com.example.demo.Repo.ProduitSemiFiniRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProduitSemiFiniController {
	
	@Autowired(required=true)
	ProduitSemiFiniRepo rep ;


	@GetMapping("/showAllproduitSemiFini")
	public List<ProduitSemiFini> getAll(){
	    List <ProduitSemiFini> produitSemiFini = this.rep.findAll();
	    return produitSemiFini;
	}
	
@RequestMapping(value = "/createproduitSemiFini",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public ProduitSemiFini add(@RequestBody  ProduitSemiFini produitSemiFini ){
		
	  try {
		  ProduitSemiFini e = rep.save(produitSemiFini);
        return e ; }
	  catch(Exception E){
		  return null ;
	  }
    }
@DeleteMapping("/produitSemiFini/{id}")
public void delete(@PathVariable("id") String id) {
	this.rep.deleteById(id);	
}

}
