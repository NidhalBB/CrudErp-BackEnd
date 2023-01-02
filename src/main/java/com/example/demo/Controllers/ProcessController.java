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

import com.example.demo.Models.Process;
import com.example.demo.Repo.ProcessRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ProcessController {

	@Autowired(required=true)
	ProcessRepo rep ;

	@GetMapping("/showAllProcess")
	public List<Process> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createProcess",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Process add(@RequestBody  Process process ) throws IOException{
	    return this.rep.save(process);
    }
}
