package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.Echantillon;
import com.example.demo.Models.ImageModel;
import com.example.demo.Repo.EchantillonRepo;
import com.example.demo.Repo.ImageRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EchantillonController {

	@Autowired(required=true)
		EchantillonRepo rep ;
	@Autowired(required=true)
	ImageRepository imageRepository;
	
	@GetMapping("/showAll")
    public List<Echantillon> getAll(){
        List <Echantillon> echantillons = this.rep.findAll();
        return echantillons;
    }
	
	@RequestMapping(value = "/addechantillon",method = RequestMethod.POST)
    public Echantillon create(Echantillon echantillon ,@RequestParam(value = "image") MultipartFile file){
		
	  try {
		  String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	      
	      Echantillon e = rep.save(echantillon);
        return e ; }
	  catch(Exception E){
		  return echantillon ;
	  }
    }
	@RequestMapping(value = "/createechantillon",method = RequestMethod.POST,consumes = {MediaType.APPLICATION_JSON_VALUE})
	
	public Echantillon add(@RequestBody  Echantillon echantillon ){
		
	  try {
	     Echantillon e = rep.save(echantillon);
	     System.out.println(echantillon.getNumEchantillon());
        return e ; }
	  catch(Exception E){
		  return null ;
	  }
    }
	@GetMapping("/getechantillon/{id}")
    public Echantillon getUser(@PathVariable String id){
        Optional<Echantillon> e = this.rep.findById(id);
        return e.get(); 
    }
	
	@RequestMapping(value = "/editechantillon/{id}",method = RequestMethod.POST )
	@ResponseBody
	public Echantillon update(@PathVariable("id") String id ,@RequestParam(value = "file") MultipartFile file,Echantillon echantillon) throws IOException {
		Optional<Echantillon> e = this.rep.findById(id);

		  ImageModel image = new ImageModel();
        
	      	image.setName(StringUtils.cleanPath(file.getOriginalFilename()));
	      	image.setContentType(file.getContentType());
	      	image.setCertif(file.getBytes());
	      	image.setSize(file.getSize());
	      	ImageModel filesaved = imageRepository.save(image);
	      	
			if(e!=null) {
				e.get().setAg(echantillon.getAg()!=null ? echantillon.getAg() : filesaved);
				e.get().setTauxFe(echantillon.getTauxFe()!=0 ? echantillon.getTauxFe() : e.get().getTauxFe());
				e.get().setTauxSi(echantillon.getTauxSi()!=0 ? echantillon.getTauxSi() : e.get().getTauxSi());
				this.rep.save(e.get());
				return e.get();
			}else {
				return e.get();
			}
	}
	
	
	@DeleteMapping("/deletechantillon/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("Echantillon is deleted successfully.!", HttpStatus.OK);
	}
}
