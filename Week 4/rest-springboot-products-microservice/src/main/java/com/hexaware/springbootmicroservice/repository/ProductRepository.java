package com.hexaware.springbootmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.hexaware.springbootmicroservice.entities.Products;
@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
