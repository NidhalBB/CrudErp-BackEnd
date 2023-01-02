package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.Chimique;
import com.example.demo.Models.ImageModel;
import com.example.demo.Repo.ImageRepository;
import com.example.demo.Repo.ChimiqueRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ChimiqueController {
	
	@Autowired(required=true)
	ChimiqueRepo rep ;
	@Autowired(required=true)
	ImageRepository imageRepository;
	
	@GetMapping("/showAllchimique")
    public List<Chimique> getAll(){
        List <Chimique> p = this.rep.findAll();
        return p;
    }
	
	@PostMapping(value = "/addChimique",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
		    produces = MediaType.APPLICATION_JSON_VALUE)
	
    public Chimique create(Chimique chimique , MultipartFile file , MultipartFile file2)throws IOException{
		
	 if(file2!=null && file!=null) 
	 {
		  ImageModel image = new ImageModel();
		  ImageModel image2 = new ImageModel();
          
	      	image.setName(StringUtils.cleanPath(file.getOriginalFilename()));
	      	image.setContentType(file.getContentType());
	      	image.setCertif(file.getBytes());
	      	image.setSize(file.getSize());
	      	ImageModel filesaved = imageRepository.save(image);
	      	image2.setName(StringUtils.cleanPath(file2.getOriginalFilename()));
	      	image2.setContentType(file2.getContentType());
	      	image2.setCertif(file2.getBytes());
	      	image2.setSize(file2.getSize());
	      	ImageModel filesaved2 = imageRepository.save(image2);
	
	      	chimique.setAg(filesaved);
	      	chimique.setDrx(filesaved2);
	      	Chimique c = rep.save(chimique); 
	      	return c;
	     }else {
	      		return this.rep.save(chimique);
	      	}
    }
}
