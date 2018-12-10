package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lecturer.model.Courses;


public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
