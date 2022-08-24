package com.example.demo.Controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Repo.ImageRepository;
import com.example.demo.Models.ImageModel;
import com.example.demo.Models.Echnatilonnage;
import com.example.demo.Repo.EchantilonnageRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EchantillonageController {

	@Autowired(required=true)
	EchantilonnageRepo rep ;
	@Autowired(required=true)
	ImageRepository imageRepository;
	
	@PostMapping(value = "/addvac",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
		    produces = MediaType.APPLICATION_JSON_VALUE)
	
    public Echnatilonnage create(@RequestParam(value = "file") MultipartFile file , @RequestParam(value = "file1") MultipartFile file1 , @RequestParam(value = "file2") MultipartFile file2)throws IOException{
		Echnatilonnage e = new Echnatilonnage();
		ImageModel image = new ImageModel();
		ImageModel image1 = new ImageModel();
		ImageModel image2 = new ImageModel();
        
      	image.setName(StringUtils.cleanPath(file.getOriginalFilename()));
      	image1.setName(StringUtils.cleanPath(file1.getOriginalFilename()));
      	image2.setName(StringUtils.cleanPath(file2.getOriginalFilename()));
      	image.setContentType(file.getContentType());
      	image1.setContentType(file1.getContentType());
      	image2.setContentType(file2.getContentType());
      	image.setCertif(file.getBytes());
      	image.setSize(file.getSize());
      	image1.setCertif(file1.getBytes());
      	image1.setSize(file1.getSize());
      	image2.setCertif(file2.getBytes());
      	image2.setSize(file2.getSize());
      	ImageModel filesaved = imageRepository.save(image);
      	ImageModel filesaved1 = imageRepository.save(image1);
      	ImageModel filesaved2 = imageRepository.save(image2);
		e.setApprobation(filesaved);
		e.setAutorisation(filesaved1);
		e.setConstruction(filesaved2);
	      return this.rep.save(e); 
	  
    }
}
