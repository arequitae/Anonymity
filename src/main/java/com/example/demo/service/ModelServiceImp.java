package com.example.demo.service;

import com.example.demo.dto.RiskModel;
import com.example.demo.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImp implements ModelService{
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<RiskModel> findAll() {

        return modelRepository.findAll();
    }
}
