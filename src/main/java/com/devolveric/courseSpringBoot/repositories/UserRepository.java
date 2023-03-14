package com.devolveric.courseSpringBoot.repositories;

import com.devolveric.courseSpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
