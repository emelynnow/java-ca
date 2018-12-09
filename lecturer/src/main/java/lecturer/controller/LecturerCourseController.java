package lecturer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lecturer.dao.LecturerCourseDAO;
import lecturer.model.Student;


@Controller
public class LecturerCourseController {

	@Autowired
	private LecturerCourseDAO lecturercourseDAO;
	
	@RequestMapping(value="/lecturer-course",method=RequestMethod.GET)
	public String LecturerCoursePage() {
		
		return "lecturer-course";
	}
	
}