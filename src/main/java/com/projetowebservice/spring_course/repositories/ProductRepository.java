package com.projetowebservice.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.spring_course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
