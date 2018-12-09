package lecturer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.model.LecturerCourse;
import lecturer.model.Student;
import lecturer.repository.LecturerCourseRepository;

@Service
public class LecturerCourseDAO{

	@Autowired
	LecturerCourseRepository lecturercourserepository;
	
	/* search all employees*/
	
	public List<LecturerCourse> findAll(){
		return lecturercourserepository.findAll();
	}
	
}
