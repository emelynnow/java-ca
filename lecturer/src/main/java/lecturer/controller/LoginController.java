package lecturer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lecturer.dao.LoginDAO;
import lecturer.model.Login;

@Controller
public class LoginController {
	
	@Autowired
	LoginDAO loginDAO;
	

}
