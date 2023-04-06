package edu.mfvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
