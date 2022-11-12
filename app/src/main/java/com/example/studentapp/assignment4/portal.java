package com.example.studentapp.assignment4;

public class portal {
    int img;
    String name;
    String course;


    public portal(int img, String name, String course) {
        this.img = img;
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
