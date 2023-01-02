package com.projetowebservice.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.spring_course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
