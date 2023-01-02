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


import com.example.demo.Models.SousFamille;
import com.example.demo.Repo.SousFamilleRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SousFamilleController {

	@Autowired(required=true)
	SousFamilleRepo rep ;
	
	@GetMapping("/showAllSousfamille")
    public List<SousFamille> getAll(){
        List<SousFamille> sousFamille = this.rep.findAll();
        return sousFamille;
    }
	@RequestMapping(value = "/createSousfamille",method = RequestMethod.POST)
	public SousFamille add(@RequestBody  SousFamille sousFamille ){
	return this.rep.save(sousFamille);
	}
	
	@DeleteMapping("/sousfamille/{id}")
	public void delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);	
	}

}
