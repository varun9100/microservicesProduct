package com.varun.springms1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varun.springms1.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
