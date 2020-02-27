package com.example.demo.mapper;


import com.example.demo.dto.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.io.StringReader;


@Mapper
public interface AdminMapper {
    @Select("select * from admin where id = #{adminId}")
    Admin Sel(@Param("adminId")Integer Id);
    @Select(" SELECT * FROM admin where id = #{adminId} and pwd = #{adminPwd}")
    Admin login(@Param("adminId")Integer Id,@Param("adminPwd") String passWord);
    @Insert("insert into admin (id,pwd) values (#{adminId},#{adminPwd})")
    int register(@Param("adminId")Integer Id,@Param("adminPwd") String passWord);
}
