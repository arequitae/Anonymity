package com.example.demo.mapper;

import com.example.demo.dto.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from users where userId = #{userId}")
    User findUserByUserid(@Param("userId") Integer userId);
    @Insert("insert into users (userId,pwd) values (#{userId},#{pwd})")
    boolean insertUsers (@Param("userId") Integer userId,@Param("pwd") String pwd);
}
