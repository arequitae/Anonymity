package com.example.demo.controller;

import com.example.demo.dto.Model;
import com.example.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/model")
public class ModelController {
    @Autowired
    private ModelService modelService;
    @RequestMapping("/find")
    @ResponseBody
    public List<Model> findByParentCode(@RequestParam("ModelId") Integer modelId){
        return modelService.findByModelId(modelId);
    }

}
