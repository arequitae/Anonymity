package com.example.demo.controller;

import com.example.demo.dto.RiskModel;
import com.example.demo.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
@RequestMapping("/hhh")
public class IndexController {

    @Autowired
    private ModelService modelService;
    @GetMapping("/hhh")//匹配路径
    public String index(Model model)
    {
           List<RiskModel> riskModelList=modelService.findAll();
           model.addAttribute("riskModelList",riskModelList);
            return "index";
        }


}

