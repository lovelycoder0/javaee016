package com.example.demo.mapper;

import com.example.demo.model.StudentHomework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentHomeworkmapper {

    List<StudentHomework> selectStudentHomework();

    public void insertStudentHomework(@Param("stuid") int stuid, @Param("homeworkid") int homeworkid, @Param("homeworktitle") String homeworktitle, @Param("homeworkContent") String homeworkContent);

    StudentHomework findstuById(int id);

    int updateStudentHomework(StudentHomework studentHomework);

    int deleteStudentHomework(int id);
}

