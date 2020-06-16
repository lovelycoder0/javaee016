package com.example.demo.mapper;

import com.example.demo.model.Homework;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Homeworkmapper {

    List<Homework> selectHomework();
    public void insertHomework(@Param("homeworkid")int homeworkid, @Param("homeworktitle")String homeworktitle);

    Homework findHomeworkById(int homeworkid);

    int updateHomework(Homework homework);

    int deleteHomework(int homeworkid);
}

