package com.hexaware.springbootcustomermicro.reepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CustomerRepository extends JpaRepository<com.hexaware.springbootcustomermicro.entities.Customer, Integer> {

}
