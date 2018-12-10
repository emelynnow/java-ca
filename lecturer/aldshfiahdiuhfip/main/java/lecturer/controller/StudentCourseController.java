package lecturer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lecturer.dao.StudentCourseDAO;
import lecturer.model.LecturerCourse;
import lecturer.model.Student;
import lecturer.model.StudentCourse;


@Controller
public class StudentCourseController {

	@Autowired
	StudentCourseDAO studentcourseDAO;
	
	@RequestMapping(value = "/courseenrollment/{courseid}", method = RequestMethod.GET)
	public ModelAndView getAll(@PathVariable int courseid) {
		
		List<StudentCourse> list=studentcourseDAO.findOneCourse(courseid);
		ModelAndView mav = new ModelAndView("courseenrollment");
		mav.addObject("list",list);
		return mav;
	}
	
}
