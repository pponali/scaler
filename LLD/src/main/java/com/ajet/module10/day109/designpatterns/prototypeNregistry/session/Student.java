package com.ajet.module10.day109.designpatterns.prototypeNregistry.session;

public class Student implements ProtoType<Student>{
    String name;
    String id;
    String batch;
    int age;

    public Student(Student student){
        this.name = student.name;
        this.id = student.id;
        this.batch = student.batch;
        this.age = student.age;
    }

    public Student() {

    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
