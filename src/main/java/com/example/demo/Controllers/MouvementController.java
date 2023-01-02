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

import com.example.demo.Models.Mouvement;
import com.example.demo.Repo.MouvementRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MouvementController {

	@Autowired(required=true)
	MouvementRepo rep;

	@GetMapping("/showMouvement")
    public List<Mouvement> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createMouvement",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Mouvement add(@RequestBody  Mouvement mouvement ) throws IOException{
	    return this.rep.save(mouvement);
    }
}
