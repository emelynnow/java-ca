package lecturer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lecturer.dao.UsersDAO;
import lecturer.model.Users;


@Controller
public class UsersController {

	@Autowired
	UsersDAO usersDAO;
	
	/* to create or save a user */
	@PostMapping("/users")
	public Users createUser(@Valid @RequestBody Users usr) {
		return usersDAO.save(usr);
	}
	
	/* get all users */
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return usersDAO.findAll();
	}
	
	/* get a user by Id */
	@GetMapping("/users/{id}")
	public ResponseEntity<Users> getUserById(@PathVariable(value="id") Long usrId){
		Users ur = usersDAO.findOne(usrId);
		
		if(ur == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(ur);
	}
	
	/* Update a user */
	@PutMapping("/users/{id}")
	public ResponseEntity<Users> updateUser(@PathVariable(value="id") Long usrId, @Valid @RequestBody Users userDetails){
		
		Users ur = usersDAO.findOne(usrId);
		if(ur == null) {
			return ResponseEntity.notFound().build();
		}
		ur.setAddress(userDetails.getAddress());
		ur.setContactNo(userDetails.getContactNo());
		ur.setStatus(userDetails.getStatus());

		Users updateUser = usersDAO.save(ur);
		return ResponseEntity.ok().body(updateUser);
	}
	
}