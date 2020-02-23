package com.example.demo.controller;

import com.example.demo.dto.RiskModel;
import com.example.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class ModelController {
    @Autowired
    private ModelService modelService;
    @RequestMapping("/")
    public String Show(Model model)
    {
        List<RiskModel> riskModelList=modelService.findAll();
        model.addAttribute("riskModelList",riskModelList);
        return "index_test";
    }

}
