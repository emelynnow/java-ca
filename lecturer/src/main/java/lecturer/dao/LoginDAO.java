 package lecturer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.repository.LoginRepository;

@Service
public class LoginDAO {

	@Autowired
	LoginRepository loginrepository;

}
