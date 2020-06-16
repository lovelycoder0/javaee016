package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Usermapper {

        public void insertUser(@Param("username")String username, @Param("password")String password,@Param("authority")int authority);
        public User selectUser(@Param("username")String username, @Param("password")String password,@Param("authority")int authority);
}

