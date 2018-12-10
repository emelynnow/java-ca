package lecturer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lecturer.model.StudentCourse;
import lecturer.repository.StudentCourseRepository;


@Service
public class StudentCourseDAO {

	@Autowired
	StudentCourseRepository studentcourserepository;

	public List<StudentCourse> findAll() {
		return studentcourserepository.findAll();
	}
	
	public List<StudentCourse> findOneCourse(int courseid) {
		return studentcourserepository.findStudentCoursesByID(courseid);
	}
}
