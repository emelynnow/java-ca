package lecturer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.repository.CoursesRepository;


@Service
public class CoursesDAO {

	@Autowired
	CoursesRepository coursesrepository;
	
}