package com.example.demo.service;

import com.example.demo.mapper.Studentmapper;
import com.example.demo.model.Student;
import com.example.demo.model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Studentmapper studentmapper;

    public boolean insertStudent(int stuid,String stuname){
        studentmapper.insertStudent(stuid,stuname);
        return true;
    }

    public List<Student> selectStudent(){
        return studentmapper.selectStudent();
    }

    public Student findstudentById(int stuid){

        return studentmapper.findstudentById(stuid);
    }

    public int updateStudent(Student student){
        return studentmapper.updateStudent(student);
    }

    public int deleteStudent(int stuid){
        return studentmapper.deleteStudent(stuid);
    }
}
