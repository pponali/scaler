package com.ajet.module10.day109.designpatterns.prototypeNregistry.session;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student s1 = studentRegistry.get("good");
        Student s2 = studentRegistry.get("good");
        Student s3 = studentRegistry.get("good");
    }

    private static void fillRegister(StudentRegistry studentRegistry) {
        Student goodStudent = new Student();
        goodStudent.name = "Good student";

        Student hardworkingStudent = new Student();
        hardworkingStudent.name = "Hardworking student";

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.name = "Intelligent student";

        studentRegistry.put("good", goodStudent);
        studentRegistry.put("hardworking", hardworkingStudent);
        studentRegistry.put("intelligent", intelligentStudent);


    }
}
