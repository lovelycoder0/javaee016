package com.example.demo.service;

import com.example.demo.mapper.Homeworkmapper;
import com.example.demo.model.Homework;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkService {

    @Autowired
    Homeworkmapper homeworkmapper;

    public boolean insertHomework(int homeworkid,String homeworktitle){
        homeworkmapper.insertHomework(homeworkid,homeworktitle);
        return true;
    }

    public List<Homework> selectHomework(){
        return homeworkmapper.selectHomework();
    }

    public Homework findHomeworkById(int homeworkid){

        return homeworkmapper.findHomeworkById(homeworkid);
    }

    public int updateHomework(Homework homework){
        return homeworkmapper.updateHomework(homework);
    }

    public int deleteHomework(int homeworkid){
        return homeworkmapper.deleteHomework(homeworkid);
    }

}
