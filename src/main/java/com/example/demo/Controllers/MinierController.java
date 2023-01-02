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

import com.example.demo.Models.QuantiteMinier;
import com.example.demo.Repo.QuantiteMinie;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class MinierController {


	@Autowired(required=true)
	QuantiteMinie rep;

	@GetMapping("/showQuantiteMinier")
    public List<QuantiteMinier> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createQuantiteMinier",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public QuantiteMinier add(@RequestBody  QuantiteMinier minier ) throws IOException{
	    return this.rep.save(minier);
    }
}
