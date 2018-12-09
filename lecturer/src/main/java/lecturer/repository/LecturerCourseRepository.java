package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lecturer.model.LecturerCourse;


public interface LecturerCourseRepository extends JpaRepository<LecturerCourse, Integer> {

}