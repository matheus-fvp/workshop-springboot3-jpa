package edu.mfvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
