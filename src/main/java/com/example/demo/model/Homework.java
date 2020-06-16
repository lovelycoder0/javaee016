package com.example.demo.model;

public class Homework {
    int homeworkid;
    String homeworktitle;

    public int getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(int homeworkid) {
        this.homeworkid = homeworkid;
    }

    public String getHomeworktitle() {
        return homeworktitle;
    }

    public void setHomeworktitle(String homeworktitle) {
        this.homeworktitle = homeworktitle;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "homeworkid=" + homeworkid +
                ", homeworktitle='" + homeworktitle + '\'' +
                '}';
    }
}
