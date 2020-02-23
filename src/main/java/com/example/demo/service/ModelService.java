package com.example.demo.service;

import com.example.demo.dto.Model;

import java.util.List;

public interface ModelService {

    List<Model> findByModelId(Integer modelId);
}