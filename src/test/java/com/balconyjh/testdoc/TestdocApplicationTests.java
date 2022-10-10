package com.balconyjh.testdoc;

import com.balconyjh.testdoc.domain.Student;
import com.balconyjh.testdoc.domain.User;
import com.balconyjh.testdoc.mapper.StudentMapper;
import com.balconyjh.testdoc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestdocApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    public void  testfindById(){
        User user = userMapper.findById(1);
        System.out.println(user);
    }

    @Test
    public void testaddUser(){
        User user = new User();
        user.setUname("赵七");
        user.setUage(22);
        userMapper.addUser(user);
        System.out.println(userMapper.findById(5));
    }

    @Test
    public void testupdateUser(){
        User user = userMapper.findById(3);
        user.setUage(20);
        user.setUname("gkd");
        userMapper.updateUser(user);
        System.out.println(userMapper.findById(3));

    }

    @Test
    public void  testdeleteUser(){
        userMapper.deleteUser(3);
    }

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testfindAllStudent(){
        List<Student> allStudent = studentMapper.findAllStudent();
        for (Student student:allStudent){
            System.out.println(student);
        }
    }

}
