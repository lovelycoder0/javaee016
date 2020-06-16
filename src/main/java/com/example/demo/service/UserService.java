package com.example.demo.service;

import com.example.demo.mapper.Usermapper;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        @Autowired
        public Usermapper usermapper;

        public boolean insertUser(String username,String password,int authority){
            usermapper.insertUser(username,password,authority);
            return true;
        }

        public User selectUser(String username, String password,int authority){
            System.out.println(username+" " +username);
            return usermapper.selectUser(username,password,authority);
        }

}
