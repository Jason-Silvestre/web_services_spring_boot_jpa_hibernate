package com.jasonsilvestre.course.repositories;

import com.jasonsilvestre.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
