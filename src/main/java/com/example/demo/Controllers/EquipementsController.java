package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Equipements;
import com.example.demo.Repo.EquipementsRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EquipementsController {

	@Autowired(required=true)
	EquipementsRepo rep ;
	
	@GetMapping("/showAllEquipements")
    public List<Equipements> getAll(){
        List <Equipements> e = this.rep.findAll();
        return e;
    }
	
	@GetMapping("/machines/{id}")
    public Optional<Equipements> getMachine(@PathVariable String id){
        Optional<Equipements> machine = this.rep.findById(id);
        if (machine != null) {
        	machine.get().setId(null) ;
        	return machine;					
        }
        else return null ; 
    }
	@RequestMapping(value = "/addEquipements",method = RequestMethod.POST)
    public Equipements create(@RequestBody Equipements equipements){
	  try {
		  Equipements e = rep.save(equipements);
        return e ; }
	  catch(Exception E){
		  return equipements ;
	  }
    }
	
	@DeleteMapping("/equipement/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("Equipement is deleted successfully.!", HttpStatus.OK);
	}
}
