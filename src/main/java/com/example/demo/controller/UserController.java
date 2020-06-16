package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.example.demo.service.StudentService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
        @Autowired
        private UserService userService;

        @Autowired
        StudentService studentService;

        @RequestMapping("/login")
        public String login(){
            return "index";
        }

        @RequestMapping("/register")
        public String register(){
            return "register";
        }


        @RequestMapping("/dologin")
        public String doLogin(User user, Map<String,Object> map){
            User user1 = userService.selectUser(user.getUsername(),user.getPassword(),user.getAuthority());
            System.out.println(user1);
            if(user1!=null && user1.getAuthority()==0){
                map.put("mag","教师登入成功");
                return "teacher";
            }
            else if(user1!=null && user1.getAuthority()==1){
                map.put("msg","学生登入成功！");
                return "student";
            } else{
                map.put("msg","密码或账户错误！");
                return "fail";
                }

        }

        @RequestMapping("/doregister")
        public String doRegister(User user,Map<String,Object> map){
            userService.insertUser(user.getUsername(),user.getPassword(),user.getAuthority());
            map.put("msg","注册成功");
            return "index";
        }
}
