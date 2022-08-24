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

import com.example.demo.Models.Operation;
import com.example.demo.Repo.OperationRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OperationController {
	
	@Autowired(required=true)
	OperationRepo rep ;

	@GetMapping("/showAllOperation")
	public List<Operation> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createOperation",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Operation add(@RequestBody  Operation operation ) throws IOException{
	    return this.rep.save(operation);
    }

}
