package com.example.yixin.dao;

import com.example.yixin.model.Drawing;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrawingDAO {

    @Insert("insert into drawing (width,create_time,update_time) values (#{width},now(),now())")
    int save(List<Drawing> drawingList);
}
