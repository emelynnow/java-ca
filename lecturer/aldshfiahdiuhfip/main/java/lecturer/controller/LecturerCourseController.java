package lecturer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lecturer.dao.LecturerCourseDAO;
import lecturer.model.LecturerCourse;
import lecturer.model.Student;

@Controller
public class LecturerCourseController {

	@Autowired
	private LecturerCourseDAO lecturercourseDAO;

	@RequestMapping(value = "/lecturer-course", method = RequestMethod.GET)
	public ModelAndView getAll() {
		
		List<LecturerCourse> list=lecturercourseDAO.findAll();
		ModelAndView mav = new ModelAndView("lecturer-course");
		mav.addObject("list",list);
		return mav;
	}
	

	
}

