package in.harrylu.expensetrackerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.harrylu.expensetrackerapi.entity.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
	
	Boolean existsByEmail(String email);
	

}
