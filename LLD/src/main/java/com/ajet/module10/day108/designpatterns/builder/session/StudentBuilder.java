package com.ajet.module10.day108.designpatterns.builder.session;

public class StudentBuilder {
    private String name;
    private String batch;
    private int age;
    private int year;
    private int psp;

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getYear() {
        return year;
    }

    public StudentBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPsp() {
        return psp;
    }

    public StudentBuilder setPsp(int psp) {
        this.psp = psp;
        return this;
    }

    public Student build() throws Exception {
        return null;//new Student(this);
    }
}
