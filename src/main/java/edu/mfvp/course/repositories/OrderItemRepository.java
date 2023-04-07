package edu.mfvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
