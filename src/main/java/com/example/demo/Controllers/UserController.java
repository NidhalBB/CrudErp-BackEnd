package com.example.demo.Controllers;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.User;
import com.example.demo.Repo.UserRepo;
		

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {
	
	@Autowired(required=true)
	UserRepo rep ;
	
	@GetMapping("/")
	public String home() {
		return "hello" ;
	}
	@GetMapping("/sum")
	public int sum() {
		return (int) this.rep.count(); 
	}
	
	 @GetMapping("/getuser/{id}")
	    public Optional<User> getUser(@PathVariable String id){
	        Optional<User> user = this.rep.findById(id);
	        if (user != null) {
	        	user.get().setId(null) ;
	        	return user  ;					
	        }
	        else return null ; 
	    }
	@GetMapping("/stat")
	public List<Double> getStat() {
		int sumG = 0;
		int sumO = 0;
		List<Double> sum = null;
		String [] a = null;
		List<User> users = this.rep.findAll();
		for(int i =0 ; i<sum() ; i++) {
			a = users.get(i).getEmail().split("[@._]");
			for(int j =0 ; j < a.length ; j++) {
				if(a[j].equals("gmail")) {
					sumG++;
				}else if(a[j].equals("outlook")) {
					sumO++;
				}
			}
			sum.add((double)sumO/users.size()*100);
			sum.add((double)sumG/users.size()*100);
		}
		
		return sum; 
	}
	@GetMapping("/show")
    public List<User> getAll(){
        List<User> users = this.rep.findAll();
        return users;
    }
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	    public User create(@RequestBody User user){
		  try {
		    User u = new User(user.getName() ,user.getEmail() , user.getPassword()) ; 
	        this.rep.save(u);
	        u.setId(null);
	        return u ; }
		  catch(Exception E){
			  return user ;
		  }
	    }
	@RequestMapping(value = "/edit{id}",method = RequestMethod.POST)
	@ResponseBody
	public Optional<User> update(@RequestBody User user) throws IOException {
		Optional<User> u = this.rep.findById(user.getId());
		 if (u != null) {
             u.get().setEmail(user.getEmail()!= null ? user.getEmail():u.get().getEmail() );
             u.get().setName(user.getName()!= null ? user.getName():u.get().getName());
             u.get().setPassword(user.getPassword()!= null ? user.getPassword():u.get().getPassword() ); 
             this.rep.save(u.get());

             	return u;
           }

		 else {
			 return null;
		 }
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id) {
		this.rep.deleteById(id);
		return new ResponseEntity<String>("User is deleted successfully.!", HttpStatus.OK);
	}
}
