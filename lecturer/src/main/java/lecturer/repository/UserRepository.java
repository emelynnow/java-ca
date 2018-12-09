package lecturer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lecturer.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
