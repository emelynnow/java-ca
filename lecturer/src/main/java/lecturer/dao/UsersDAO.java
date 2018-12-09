package lecturer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.model.Users;
import lecturer.repository.UserRepository;

@Service
public class UsersDAO {
	
	@Autowired
	UserRepository userRepository;

	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Users findOne(Long usrId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users save(Users ur) {
		// TODO Auto-generated method stub
		return null;
	}


}
