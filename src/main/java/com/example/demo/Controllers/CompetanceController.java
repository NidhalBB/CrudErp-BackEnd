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

import com.example.demo.Models.Competance;
import com.example.demo.Repo.CompetanceRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CompetanceController {

	@Autowired(required=true)
	CompetanceRepo rep;

	@GetMapping("/showCompetance")
    public List<Competance> getAll(){
        return this.rep.findAll();
    }
	@RequestMapping(value = "/createCompetance",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Competance add(@RequestBody  Competance competance ) throws IOException{
	    return this.rep.save(competance);
    }
	
		@RequestMapping(value = "/editCompetance{id}",method = RequestMethod.POST)
		@ResponseBody
		public Optional<Competance> update(@RequestBody Competance competance) throws IOException {
			Optional<Competance> u = this.rep.findById(competance.getId_competance());
			 if (u != null) {
		         u.get().setMatricule(competance.getMatricule()!= null ? competance.getMatricule():u.get().getMatricule());
		         u.get().setCollaborateur(competance.getCollaborateur()!= null ? competance.getCollaborateur():u.get().getCollaborateur());
		         u.get().setType(competance.getType()!= null ? competance.getType():u.get().getType());
		         u.get().setDescription(competance.getDescription()!= null ? competance.getDescription():u.get().getDescription());
		         this.rep.save(u.get());
		
		         	return u;
		       }
		
			 else {
				 return null;
			 }
		}
	
	@DeleteMapping("/Competance/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("User is deleted successfully.!", HttpStatus.OK);
	}
}
