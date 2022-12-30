package com.projetowebservice.spring_course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetowebservice.spring_course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
