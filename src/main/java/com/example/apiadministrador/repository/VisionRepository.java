package com.example.apiadministrador.repository;

import com.example.apiadministrador.model.Vision;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisionRepository extends JpaRepository<Vision,Integer> {
}
