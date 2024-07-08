package com.example.yixin.dao;

import com.example.yixin.model.Project;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectDAO {

    @Insert("insert into project(project_name,create_time,update_time) values (#{projectName},now(),now())")
    int save(List<Project> projectList);
}
