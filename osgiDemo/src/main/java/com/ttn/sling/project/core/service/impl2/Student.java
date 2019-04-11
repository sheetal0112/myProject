package com.ttn.sling.project.core.service.impl2;

public class Student {
     String name;
    int id;
     int marks;
    public  Student(String name,int marks,int id){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student [ID: "+id+" NAME: "+name+" MARKS: "+marks+"]";
    }
}

