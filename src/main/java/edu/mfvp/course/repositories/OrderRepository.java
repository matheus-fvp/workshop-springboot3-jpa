package edu.mfvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
