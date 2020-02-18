package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class RegService implements IRegService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean regUser(Integer uerId, String pwd) {

        Boolean flag;
        try {
            flag = userMapper.insertUsers(uerId,pwd);
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
