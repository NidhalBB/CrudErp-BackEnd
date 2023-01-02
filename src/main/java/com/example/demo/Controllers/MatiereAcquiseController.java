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

import com.example.demo.Models.MatiereAcquise;
import com.example.demo.Repo.MatiereAcquiseRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MatiereAcquiseController {
	
	@Autowired(required=true)
	MatiereAcquiseRepo rep ;


	@GetMapping("/showAllmatiereAcquise")
	public List<MatiereAcquise> getAll(){
	    List <MatiereAcquise> matiereAcquise = this.rep.findAll(); 	
	    return matiereAcquise;
	}
	
@RequestMapping(value = "/creatematiereAcquise",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public MatiereAcquise add(@RequestBody  MatiereAcquise matiereAcquise ){
	return this.rep.save(matiereAcquise);
    }

@DeleteMapping("/matiereAcquise/{id}")
public void delete(@PathVariable("id") String id) {
	this.rep.deleteById(id);	
}


}
