package com.example.demo.mapper;


import com.example.demo.dto.RiskModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface ModelMapper {
    @Select("select * from model where model_id = #{model_id}")
    RiskModel findUserByUserid(@Param("model_id") int model_id);
    //List<RiskModel> findAll();
}
