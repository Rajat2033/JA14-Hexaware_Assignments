package com.hexaware.restapiheathcareprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restapiheathcareprovider.entities.HealthcareProvider;

@Repository
public interface HealthcareProviderRepository extends JpaRepository<HealthcareProvider, Integer> {

}
