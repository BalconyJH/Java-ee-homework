package com.balconyjh.testdoc.mapper;

import com.balconyjh.testdoc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface UserMapper {
    public User findById(Integer id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(Integer uid);
}
