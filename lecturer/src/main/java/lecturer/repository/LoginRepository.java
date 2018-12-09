package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lecturer.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}