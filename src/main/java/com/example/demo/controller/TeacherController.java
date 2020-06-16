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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class TeacherController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/showstu0")
    public String selectStudent(Model model){
        List<Student> students=studentService.selectStudent();
        model.addAttribute("students",students);
        return "showstu0";
    }

    @RequestMapping("/addstu")
    public String addstu(){
        return "addstu";
    }

    @RequestMapping("/doaddstu")
    public String doaddstu(Student student, Map<String,Object> map){
        studentService.insertStudent(student.getStuid(),student.getStuname());
        map.put("msg","添加成功");
        return "teacher";
    }

    @GetMapping("/updatestudent/{stuid}")
    public String updatestudent(Model model, @PathVariable int stuid){
        Student student=studentService.findstudentById(stuid);
        model.addAttribute("student",student);
        return "updatestudent";
    }
    @PostMapping("/updatestu")
    public String updatestudent(Student student){
        studentService.updateStudent(student);
        return "teacher";
    }

    @GetMapping("/deletestudent/{stuid}")
    public String deletestudent(@PathVariable int stuid){
        studentService.deleteStudent(stuid);
        return "teacher";
    }


    @Autowired
    HomeworkService homeworkService;

    @RequestMapping("/showhomework0")
    public String selectHomework(Model model){
        List<Homework> homework=homeworkService.selectHomework();
        model.addAttribute("homework",homework);
        return "showhomework0";
    }

    @RequestMapping("/addhomework")
    public String addhomework(){
        return "addhomework";
    }

    @RequestMapping("/doaddhomework")
    public String doaddhomework(Homework homework, Map<String,Object> map){
        homeworkService.insertHomework(homework.getHomeworkid(),homework.getHomeworktitle());
        map.put("msg","添加成功");
        return "teacher";
    }

    @GetMapping("/updatehomework/{homeworkid}")
    public String updatehomework(Model model, @PathVariable int homeworkid){
        Homework homework=homeworkService.findHomeworkById(homeworkid);
        model.addAttribute("homework",homework);
        return "updatehomework";
    }
    @PostMapping("/updatehome")
    public String updatehomework(Homework homework){
        homeworkService.updateHomework(homework);
        return "teacher";
    }

    @GetMapping("/deletehomework/{homeworkid}")
    public String deletehomework(@PathVariable int homeworkid){
        homeworkService.deleteHomework(homeworkid);
        return "teacher";
    }



    @Autowired
    StudentHomeworkService studentHomeworkService;

    @RequestMapping("/showstudenthomework0")
    public String selectStudentHomework(Model model){
        List<StudentHomework> studentHomeworks=studentHomeworkService.selectStudentHomework();
        model.addAttribute("studenthomework",studentHomeworks);
        return "showstudenthomework0";
    }
}
