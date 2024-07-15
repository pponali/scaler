package com.ajet.module9.day101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   08/07/24 9:01 am
 */
public class Clinet2 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.setName("Prakash");
        student1.setAge(25);
        student1.setPsp(20);



        student2.setName("Ram");
        student2.setAge(35);
        student2.setPsp(10);


        student3.setName("Rajesh");
        student3.setAge(15);
        student3.setPsp(30);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getPsp());
            System.out.println("******************");
        }

        Collections.sort(students, new PSPComparator());
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getPsp());
            System.out.println("=====================");
        }
    }


    public static class PSPComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.psp == o2.psp) {
                return 0;
            } else if(o1.psp > o2.psp) {
                return 1;
            } else {
                return -1;
            }
        }
    }


}
