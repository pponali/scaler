package com.ajet.module9.day101;

import java.util.Comparator;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   08/07/24 8:59 am
 */
public class Student implements Comparable<Student> {
    String name;
    int age;
    int psp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student o) {
       if(this.age == o.age) {
           return 0;
       } else if(this.age > o.age) {
           return 1;
       } else {
           return -1;
       }
    }



}
