package com.jasonsilvestre.course.repositories;

import com.jasonsilvestre.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
