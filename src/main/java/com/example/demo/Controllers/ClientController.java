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

import com.example.demo.Models.Client;
import com.example.demo.Repo.ClientRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ClientController{

		@Autowired(required=true)
		ClientRepo rep ;

		@GetMapping("/showAllClient")
		public List<Client> getAll(){
			return this.rep.findAll();
		}
		@RequestMapping(value = "/createClient",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
		
		public Client add(@RequestBody  Client client ) throws IOException{
		    return this.rep.save(client);
	    }
}
