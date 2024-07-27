package com.ajet.module10.day108.designpatterns.builder.session;

public class Student {

    private String name;
    private String batch;
    private int age;
    private int year;
    private int psp;

    private Student(StudentBuilder studentBuilder) throws Exception {

        if(studentBuilder.getName() == null){
            throw new Exception("name is not valid");
        }
        this.name = studentBuilder.getName();
        if(studentBuilder.getAge() < 20){
            throw new Exception("age should be more than 20");
        }
        this.age = studentBuilder.getAge();
        this.year = studentBuilder.getYear();
        this.psp = studentBuilder.getPsp();

    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }


    public static class StudentBuilder {
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
            return new Student(this);
        }
    }


}
