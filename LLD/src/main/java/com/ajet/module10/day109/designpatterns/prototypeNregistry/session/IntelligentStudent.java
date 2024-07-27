package com.ajet.module10.day109.designpatterns.prototypeNregistry.session;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(Student student) {
        super(student);

    }
    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent() {
        super();
    }

    @Override
    public IntelligentStudent copy(){
//        IntelligentStudent intelligentStudent = new IntelligentStudent();
//        intelligentStudent.age = this.age;
//        intelligentStudent.name = this.name;
//        intelligentStudent.batch = this.batch;
//        return intelligentStudent;

        return new IntelligentStudent(this);
    }

}
