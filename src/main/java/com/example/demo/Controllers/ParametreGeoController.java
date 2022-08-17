package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.ImageModel;
import com.example.demo.Models.ParametreGeo;
import com.example.demo.Repo.ImageRepository;
import com.example.demo.Repo.ParametreGeoRepo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ParametreGeoController {
	
	@Autowired(required=true)
	ParametreGeoRepo rep ;
	@Autowired(required=true)
	ImageRepository imageRepository;
	@GetMapping("/showAllParametre")
    public List<ParametreGeo> getAll(){
        List <ParametreGeo> p = this.rep.findAll();
        return p;
    }
	
	@PostMapping(value = "/addparametre",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
		    produces = MediaType.APPLICATION_JSON_VALUE)
	
    public ParametreGeo create(ParametreGeo parametreGeo ,@RequestParam(value = "file") MultipartFile file)throws IOException{
		
	 
		  ImageModel image = new ImageModel();
          
	      	image.setName(StringUtils.cleanPath(file.getOriginalFilename()));
	      	image.setContentType(file.getContentType());
	      	image.setCertif(file.getBytes());
	      	image.setSize(file.getSize());
	      	ImageModel filesaved = imageRepository.save(image);
	
			  parametreGeo.setCarte(filesaved);
		  parametreGeo.setReserve(parametreGeo.getSuperficie()*parametreGeo.getEpaisseur());
		  parametreGeo.setVolume(parametreGeo.getReserve()*parametreGeo.getDensite());
	      ParametreGeo p = rep.save(parametreGeo);
	      System.out.println(parametreGeo.getCouleur());      
	      return p ; 
	  
    }
	
	@DeleteMapping("/deletepara/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("Parametre is deleted successfully.!", HttpStatus.OK);
	}

}
