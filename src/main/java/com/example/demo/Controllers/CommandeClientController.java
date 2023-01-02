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

import com.example.demo.Models.BonAchat;
import com.example.demo.Models.CommandeClient;
import com.example.demo.Repo.CommandeClientRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CommandeClientController {

	@Autowired(required=true)
	CommandeClientRepo rep ;

	@GetMapping("/showAllCommandeClient")
	public List<CommandeClient> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createCommandeClient",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public CommandeClient add(@RequestBody  CommandeClient commandeClient ) throws IOException{
		commandeClient.setMontantHT(commandeClient.getPrix() * commandeClient.getQuantite_article());
		commandeClient.setMontantTTC((0.2*commandeClient.getMontantHT()) + commandeClient.getMontantHT());
		CommandeClient CC = rep.save(commandeClient);
	    return this.rep.save(CC);
    }
}