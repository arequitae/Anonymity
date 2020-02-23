package com.example.demo.repository;

import com.example.demo.dto.RiskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ModelRepository extends JpaRepository<RiskModel,Integer> {
    List<RiskModel> findAll();
}
