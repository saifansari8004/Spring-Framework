package in.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.entities.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>
{
	  User findByEmail(String email);
}
