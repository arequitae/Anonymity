package com.example.demo.repository;

import com.example.demo.dto.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ModelRepository extends JpaRepository<Model,Integer> {
    List<Model> findByModelId(Integer modelId);
}
