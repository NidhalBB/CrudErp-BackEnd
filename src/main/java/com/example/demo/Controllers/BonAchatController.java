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
import com.example.demo.Models.ProduitOuvrage;
import com.example.demo.Repo.BonAchatRepo;
import com.example.demo.Repo.ProduitOuvrageRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class BonAchatController {


	@Autowired(required=true)
	BonAchatRepo rep ;
	@Autowired(required=true)
	ProduitOuvrageRepo repo ;
	
	@GetMapping("/showAllBonAchat")
	public List<BonAchat> getAll(){
		return this.rep.findAll();
	}
	@RequestMapping(value = "/createBonAchat",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public BonAchat add(@RequestBody  BonAchat bonAchat ) throws IOException{
		List<String> p = this.rep.findAllProduit();
		List<ProduitOuvrage> pO = this.repo.findAll();
		for(int i = 0 ; i<pO.size() ;i++) {
				if (pO.get(i).getDesignation().equals(bonAchat.getDesignation_produit())) {
					bonAchat.setPrix(pO.get(i).getPrix());
					System.out.print(bonAchat.getDesignation_produit());
				}else {
					System.out.print(pO.get(i).getDesignation());
				}
			}
		bonAchat.setMontantHT(bonAchat.getPrix() * bonAchat.getQuantite_article());
		bonAchat.setMontantTTC((0.2*bonAchat.getMontantHT()) + bonAchat.getMontantHT());
		BonAchat BA = rep.save(bonAchat);
	    return BA;
    }
}
