package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lecturer.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
