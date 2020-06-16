package com.example.demo.mapper;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Studentmapper {

    List<Student> selectStudent();
    public void insertStudent(@Param("stuid")int stuid, @Param("stuname")String stuname);

    Student findstudentById(int stuid);

    int updateStudent(Student student);

    int deleteStudent(int stuid);
}
