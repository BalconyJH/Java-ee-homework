package com.balconyjh.testdoc.mapper;

import com.balconyjh.testdoc.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
@Service
public interface StudentMapper {

    public List<Student> findAllStudent();
}
