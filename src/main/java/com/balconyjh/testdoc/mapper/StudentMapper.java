package com.balconyjh.testdoc.mapper;

import com.balconyjh.testdoc.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public List<Student> findAllStudent();
}
