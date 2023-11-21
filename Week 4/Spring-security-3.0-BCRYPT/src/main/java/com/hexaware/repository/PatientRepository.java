package com.hexaware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.hexaware.entities.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Integer> {

}
