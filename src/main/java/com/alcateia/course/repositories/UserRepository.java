package com.alcateia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alcateia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
