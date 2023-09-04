package com.jasonsilvestre.course.repositories;

import com.jasonsilvestre.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
