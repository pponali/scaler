package com.ajet.module10.day108.designpatterns.builder.session;

public class Client {
    public static void main(String[] args) throws Exception {
        /*StudentBuilder sb = new StudentBuilder();
        sb.setAge(12);
        sb.setName("Prakash");
        sb.setYear(2006);
        sb.setBatch("September - morning");

        try {
            Student  student = new Student(sb);
            System.out.println("debug....");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        StudentBuilder sb2 = new StudentBuilder();
        sb2.setAge(12);
        sb2.setName("Prakash");
        sb2.setYear(2006);
        sb2.setBatch("September - morning");

        try {
            Student  student = new Student(sb2);
            System.out.println("debug....");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/





        //version3
        Student sb3 = Student
                .getBuilder()
                .setAge(12)
                .setBatch("September - morning")
                .setName("Prakash")
                .setPsp(98)
                .build();

    }
}
