package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.FamilleMachine;
import com.example.demo.Repo.FamilleMachineRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FamilleMachineController {

	@Autowired(required=true)
	FamilleMachineRepo rep ;
	
	@GetMapping("/showAllFamilleMachine")
    public List<FamilleMachine> getAll(){
        List <FamilleMachine> e = this.rep.findAll();
        return e;
    }
	@RequestMapping(value = "/addFamilleMachine",method = RequestMethod.POST)
    public FamilleMachine create(@RequestBody FamilleMachine familleMachine){
	  try {
		  FamilleMachine e = rep.save(familleMachine);
        return e ; }
	  catch(Exception E){
		  return familleMachine ;
	  }
    }
}
