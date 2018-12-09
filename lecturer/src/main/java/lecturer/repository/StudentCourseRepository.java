package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lecturer.model.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {

}