package lecturer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.repository.StudentCourseRepository;


@Service
public class StudentCourseDAO {

	@Autowired
	StudentCourseRepository studentcourserepository;
	
}
