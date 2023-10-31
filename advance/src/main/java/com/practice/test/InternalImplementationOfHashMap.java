package com.practice.test;

import java.util.HashMap;

/**
 * @author prakashponali
 * @Date 09/10/23
 */
public class InternalImplementationOfHashMap {

    public static void main(String[] args) {
        System.out.println(System.identityHashCode("prakash"));
        HashMap<String, String> map = new HashMap<>();

        Employee e1 = new Employee("emp1","1");
        Employee e2 = new Employee("emp1","1");
        System.out.println(System.identityHashCode(e1.id));
        System.out.println(System.identityHashCode(e2.id));
        map.put(e1.id, e1.name);
        map.put(e2.id, e2.name);
        System.out.println(System.identityHashCode(e1.id));
        System.out.println(System.identityHashCode(e2.id));
        System.out.println(map.get(e2.id));

   }



    public static class Employee {
        String name;
        String id;
        public Employee(String name, String id){
            this.id = id;
            this.name = name;
        }
    }

}
