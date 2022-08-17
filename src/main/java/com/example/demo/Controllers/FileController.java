package com.example.demo.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.demo.Models.FileDB;
import com.example.demo.Repo.FileDBRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FileController {

	 @Autowired
	  private FileDBRepository rep;

	  @PostMapping("/upload")
	  public BodyBuilder uploadFile(@RequestParam("file") MultipartFile file) {
	    try {
	    	String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
	        rep.save(FileDB);

	      return ResponseEntity.status(HttpStatus.OK);
	    } catch (Exception e) {
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED);
	    }
	  }

	 

	  @GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
	    FileDB fileDB = this.rep.findById(id).get();
	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
	        .body(fileDB.getData());
	  }
}
