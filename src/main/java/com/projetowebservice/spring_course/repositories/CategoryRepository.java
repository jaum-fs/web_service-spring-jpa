package com.projetowebservice.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.spring_course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
