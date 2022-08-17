package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.FamilleProduit;
import com.example.demo.Models.Magasins;
import com.example.demo.Repo.MagasinsRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MagasinsController {

	@Autowired(required=true)
	MagasinsRepo rep;
	
	@GetMapping("/showAllMagasins")
    public List<Magasins> getAll(){
        List <Magasins> magasins = this.rep.findAll();
        return magasins;
    }
	
	@RequestMapping(value = "/createMagasins",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Magasins add(@RequestBody  Magasins magasins ){
		
		  return this.rep.save(magasins);
		
    }
}
