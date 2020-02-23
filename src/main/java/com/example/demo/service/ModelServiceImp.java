package com.example.demo.service;

import com.example.demo.dto.Model;
import com.example.demo.mapper.ModelMapper;
import com.example.demo.repository.ModelRepository;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImp implements ModelService{
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<Model> findByModelId(Integer modelId) {

        return modelRepository.findByModelId(modelId);
    }
}
