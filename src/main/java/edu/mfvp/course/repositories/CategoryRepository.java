package edu.mfvp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mfvp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
