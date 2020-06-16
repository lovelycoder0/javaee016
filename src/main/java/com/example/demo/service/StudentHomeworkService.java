package com.example.demo.service;

import com.example.demo.mapper.StudentHomeworkmapper;
import com.example.demo.model.StudentHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentHomeworkService {

    @Autowired
    StudentHomeworkmapper studentHomeworkmapper;
    public boolean insertStudentHomework(int stuid,int homeworkid,String homeworktitle,String homeworkContent){
        studentHomeworkmapper.insertStudentHomework(stuid,homeworkid,homeworktitle,homeworkContent);
        return true;
    }

    public List<StudentHomework> selectStudentHomework(){
        return studentHomeworkmapper.selectStudentHomework();
    }

    public StudentHomework findById(int id){

       return studentHomeworkmapper.findstuById(id);
    }

    public int updateStudentHomework(StudentHomework studentHomework){
        return studentHomeworkmapper.updateStudentHomework(studentHomework);
    }

    public int deleteStudentHomework(int id){
        return studentHomeworkmapper.deleteStudentHomework(id);
    }
}
