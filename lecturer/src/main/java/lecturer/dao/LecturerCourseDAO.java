package lecturer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.repository.LecturerCourseRepository;

@Service
public class LecturerCourseDAO{

	@Autowired
	LecturerCourseRepository lecturercourserepository;
	
}
