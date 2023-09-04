package com.jasonsilvestre.course.repositories;

import com.jasonsilvestre.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
