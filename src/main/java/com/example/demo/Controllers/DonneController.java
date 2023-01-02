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

import com.example.demo.Models.DonneesExtraction;
import com.example.demo.Repo.DonnerExtractionRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DonneController {


	@Autowired(required=true)
	DonnerExtractionRepo rep;

	@GetMapping("/showDonneesExtraction")
    public List<DonneesExtraction> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createDonneesExtraction",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public DonneesExtraction add(@RequestBody  DonneesExtraction donnee ) throws IOException{
	    return this.rep.save(donnee);
    }
}
