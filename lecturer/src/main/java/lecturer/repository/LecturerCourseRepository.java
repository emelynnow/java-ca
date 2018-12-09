package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lecturer.model.LecturerCourse;


public interface LecturerCourseRepository extends JpaRepository<LecturerCourse, Integer> {

}