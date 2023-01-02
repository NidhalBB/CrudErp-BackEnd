package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Postes;
import com.example.demo.Repo.PostesRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PostesController {


	@Autowired(required=true)
	PostesRepo rep;
	@GetMapping("/showPostes")
    public List<Postes> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createPostes",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Postes add(@RequestBody  Postes postes ) throws IOException{
	    return this.rep.save(postes);
    }
	
		@RequestMapping(value = "/editPostes{id}",method = RequestMethod.POST)
		@ResponseBody
		public Optional<Postes> update(@RequestBody Postes postes) throws IOException {
			Optional<Postes> u = this.rep.findById(postes.getId_poste());
			 if (u != null) {
		         u.get().setPoste(postes.getPoste()!= null ? postes.getPoste():u.get().getPoste());
		         u.get().setDescription(postes.getDescription()!= null ? postes.getDescription():u.get().getDescription());
		         this.rep.save(u.get());
		
		         	return u;
		       }
		
			 else {
				 return null;
			 }
		}
	
	@DeleteMapping("/Postes/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("User is deleted successfully.!", HttpStatus.OK);
	}
}
