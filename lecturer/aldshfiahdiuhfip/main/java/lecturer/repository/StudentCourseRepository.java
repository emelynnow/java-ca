package lecturer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lecturer.model.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
	
	@Query("SELECT c from StudentCourse c WHERE c.courseId = :courseid")
	List<StudentCourse> findStudentCoursesByID(@Param("courseid") int courseid);
	

}