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

import com.example.demo.Models.Coordonne;
import com.example.demo.Repo.CoordonneRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CoordonneController {

	@Autowired(required=true)
	CoordonneRepo rep;
	@GetMapping("/showCoordonne")
    public List<Coordonne> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createCoordonne",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Coordonne add(@RequestBody  Coordonne coordonne ) throws IOException{
	    return this.rep.save(coordonne);
    }
	
		@RequestMapping(value = "/editCoordonne{id}",method = RequestMethod.POST)
		@ResponseBody
		public Optional<Coordonne> update(@RequestBody Coordonne coordonne) throws IOException {
			Optional<Coordonne> u = this.rep.findById(coordonne.getId_coordonne());
			 if (u != null) {
		         u.get().setMatricule(coordonne.getMatricule()!= null ? coordonne.getMatricule():u.get().getMatricule());
		         u.get().setCollaborateur(coordonne.getCollaborateur()!= null ? coordonne.getCollaborateur():u.get().getCollaborateur());
		         u.get().setEmail(coordonne.getEmail()!= null ? coordonne.getEmail():u.get().getEmail());
		         u.get().setAdresse(coordonne.getAdresse()!= null ? coordonne.getAdresse():u.get().getAdresse());
		         u.get().setSituation(coordonne.getSituation()!= null ? coordonne.getSituation():u.get().getSituation());
		         this.rep.save(u.get());
		
		         	return u;
		       }
		
			 else {
				 return null;
			 }
		}
	
	@DeleteMapping("/Coordonne/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("User is deleted successfully.!", HttpStatus.OK);
	}
}
