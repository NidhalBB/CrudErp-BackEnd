package com.example.demo.Controllers;

import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.Accord;
import com.example.demo.Repo.AccordRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AccordController {

	@Autowired(required=true)
	AccordRepo rep ;
	
	@GetMapping("/showAllAccords")
    public List<Accord> getAll(){
        List <Accord> e = this.rep.findAll();
        return e;
    }
	
	private static final Logger logger = Logger.getLogger(AccordController.class.getName());
	@PostMapping("/uploadA")
	public ResponseEntity<String> uploadData(@RequestParam("file") MultipartFile file) throws Exception {
		if (file == null) {
			throw new RuntimeException("You must select the a file for uploading");
		}
		InputStream inputStream = file.getInputStream();
		String originalName = file.getOriginalFilename();
		String name = file.getName();
		String contentType = file.getContentType();
		long size = file.getSize();
		logger.info("inputStream: " + inputStream);
		logger.info("originalName: " + originalName);
		logger.info("name: " + name);
		logger.info("contentType: " + contentType);
		logger.info("size: " + size);
		Accord a = new Accord();
		this.rep.save(a);
		// Do processing with uploaded file data in Service layer
		return new ResponseEntity<String>(originalName, HttpStatus.OK);
	}
}
