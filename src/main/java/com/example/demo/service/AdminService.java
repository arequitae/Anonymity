package com.example.demo.service;

import com.example.demo.dto.Admin;
import com.example.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    AdminMapper adminMapper;

    public Admin Sel(int id) {
        return adminMapper.Sel(id);
    }

    public Admin login(Integer Id, String passWord) {
        System.out.println("ID:"+Id+"Password"+passWord);
        return adminMapper.login(Id, passWord);

    }

    public int register(Admin admin) {
        return adminMapper.register(admin.getId(),admin.getPwd());

    }
}
