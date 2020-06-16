package com.example.demo.controller;

import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import com.example.demo.model.StudentHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.StudentHomeworkService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller

public class StudentController {

    @Autowired
    StudentHomeworkService studentHomeworkService;

    @RequestMapping("/addstudenthomework")
    public String addstudenthomework(){
        return "addstudenthomework";
    }

    @RequestMapping("/doaddstudenthomework")
    public String doaddstudenthomework(StudentHomework studentHomework, Map<String,Object> map){
        studentHomeworkService.insertStudentHomework(studentHomework.getStuid(),studentHomework.getHomeworkid(),studentHomework.getHomeworktitle(),studentHomework.getHomeworkContent());
        map.put("msg","添加成功");
        return "student";
    }

    @GetMapping("/updatepage/{id}")
    public String updatepage(Model model, @PathVariable int id){
        StudentHomework studentHomework=studentHomeworkService.findById(id);
        model.addAttribute("studenthomework",studentHomework);
        return "updatepage";
    }
    @PostMapping("/update")
    public String updatestudenthomework(StudentHomework studentHomework){
        studentHomeworkService.updateStudentHomework(studentHomework);
        return "student";
    }

    @GetMapping("/delete/{id}")
    public String deletestudenthomework(@PathVariable int id){
        studentHomeworkService.deleteStudentHomework(id);
        return "student";
    }

    @Autowired
    HomeworkService homeworkService;

    @RequestMapping("/showhomework1")
    public String selectHomework(Model model){
        List<Homework> homework=homeworkService.selectHomework();
        model.addAttribute("homework",homework);

        List<StudentHomework> studentHomeworks=studentHomeworkService.selectStudentHomework();
        model.addAttribute("studenthomework",studentHomeworks);

        return "showhomework1";
    }

    @Autowired
    StudentService studentService;

    @RequestMapping("/showstu1")
    public String selectStudent(Model model){
        List<Student> students=studentService.selectStudent();
        model.addAttribute("students",students);
        return "showstu1";
    }
}
