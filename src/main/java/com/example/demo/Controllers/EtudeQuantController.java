package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.EtudeQuantitative;
import com.example.demo.Models.ParametreGeo;
import com.example.demo.Repo.EtudeQRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EtudeQuantController {

	@Autowired(required=true)
	EtudeQRepo rep ;
	@Autowired
	ParametreGeoController para ;
	
	@GetMapping("/showAllEtude")
    public List<EtudeQuantitative> getAll(){
        List <EtudeQuantitative> e = this.rep.findAll();
        return e;
    }
	
	@RequestMapping(value = "/addEtude",method = RequestMethod.POST)
    public EtudeQuantitative create(EtudeQuantitative etudeQuantitative ){
		List<ParametreGeo> parametregeo = para.getAll() ;
		System.out.println(parametregeo.isEmpty());
		  
	  try {
		  etudeQuantitative.setReserve(((ParametreGeo) parametregeo).getReserve());
		  EtudeQuantitative e = rep.save(etudeQuantitative);
        return e ; }
	  catch(Exception E){
		 
		  return etudeQuantitative ;
	  }
    }
}
