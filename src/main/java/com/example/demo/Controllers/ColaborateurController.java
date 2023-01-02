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

import com.example.demo.Models.Collaborateur;
import com.example.demo.Models.Echantillon;
import com.example.demo.Repo.ColaRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ColaborateurController {
	
	@Autowired(required=true)
	ColaRepo rep;

	@GetMapping("/showCollaborateur")
    public List<Collaborateur> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createCollaborateur",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Collaborateur add(@RequestBody  Collaborateur collaborateur ) throws IOException{
	    return this.rep.save(collaborateur);
    }
	
		@RequestMapping(value = "/editCollaborateur{id}",method = RequestMethod.POST)
		@ResponseBody
		public Optional<Collaborateur> update(@RequestBody Collaborateur collaborateur) throws IOException {
			Optional<Collaborateur> u = this.rep.findById(collaborateur.getId_collaborateur());
			 if (u != null) {
		         u.get().setCnss(collaborateur.getCnss()!= null ? collaborateur.getCnss():u.get().getCnss());
		         u.get().setActive(collaborateur.getActive()!= null ? collaborateur.getActive():u.get().getActive());
		         u.get().setLieu(collaborateur.getLieu()!= null ? collaborateur.getLieu():u.get().getLieu());
		         u.get().setNom(collaborateur.getNom()!= null ? collaborateur.getNom():u.get().getNom());
		         u.get().setPrenom(collaborateur.getPrenom()!= null ? collaborateur.getPrenom():u.get().getPrenom());
		         u.get().setNum(collaborateur.getNum()!= null ? collaborateur.getNum():u.get().getNum());
		         this.rep.save(u.get());
		
		         	return u;
		       }
		
			 else {
				 return null;
			 }
		}
		
		@GetMapping("/getcolab/{id}")
	    public Collaborateur getUser(@PathVariable String id){
	        Optional<Collaborateur> c = this.rep.findById(id);
	        return c.get(); 
	    }
	
	@DeleteMapping("/Collaborateur/{id}")
	public void delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
	}
}
