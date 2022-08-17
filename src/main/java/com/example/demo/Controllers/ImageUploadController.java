package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.ImageModel;
import com.example.demo.Repo.ImageRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ImageUploadController {

	@Autowired
	ImageRepository imageRepository;
	
	@PostMapping(value = "/addfile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, 
		    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile file) {
        try {
        	ImageModel image = new ImageModel();
            
        	image.setName(StringUtils.cleanPath(file.getOriginalFilename()));
        	image.setContentType(file.getContentType());
        	image.setCertif(file.getBytes());
        	image.setSize(file.getSize());
           
            
        	imageRepository.save(image);

            return ResponseEntity.status(HttpStatus.OK)
                                 .body(String.format("File uploaded successfully: %s", file.getOriginalFilename()));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                                 .body(String.format("Could not upload the file: %s!", file.getOriginalFilename()));
        }
    }
	

    @GetMapping("get/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        Optional<ImageModel> file = this.imageRepository.findById(id);

        if (!file.isPresent()) {
            return ResponseEntity.notFound()
                                 .build();
        }

        ImageModel fileEntity = file.get();
        return ResponseEntity.ok()
                             .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileEntity.getName() + "\"")
                             .contentType(MediaType.valueOf(fileEntity.getContentType()))
                             .body(fileEntity.getCertif());
    }
}
