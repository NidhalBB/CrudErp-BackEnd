package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.Echantillon;
import com.example.demo.Models.Permis;
import com.example.demo.Repo.PermisRepo;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PermisController {
	@Autowired(required=true)
	PermisRepo rep ;
	
	@GetMapping("/showAllpermis")
    public List<Permis> getAll(){
        List <Permis> permis = this.rep.findAll();
        return permis;
    }
	@PostMapping("/uploadFiles")
	public Permis uploadFiles(@RequestParam(value = "permisRecherche") MultipartFile permisRecherche,@RequestParam(value = "permisEchantillon") MultipartFile permisEchantillon,@RequestParam(value = "permisExploration") MultipartFile permisExploration ,@RequestParam("files") MultipartFile[] files) {
		
		Permis p = new Permis();
		List<String> F = new ArrayList<String>();
        F.add(files.toString()) ;
        String fileE = StringUtils.cleanPath(permisEchantillon.getOriginalFilename());
		String fileEx = StringUtils.cleanPath(permisExploration.getOriginalFilename());
		String fileR = StringUtils.cleanPath(permisRecherche.getOriginalFilename());
		
        p.setPermisEchantillon(fileE);
        p.setPermisExploration(fileEx);
        p.setPermisRecherche(fileR);
        p.setFiles(F);
        rep.save(p) ;
	    return p;
	}

}
