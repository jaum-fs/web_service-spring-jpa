package com.projetowebservice.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.spring_course.entities.OrderItem;
import com.projetowebservice.spring_course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
