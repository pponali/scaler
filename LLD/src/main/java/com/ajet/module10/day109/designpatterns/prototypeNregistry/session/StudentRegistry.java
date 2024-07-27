package com.ajet.module10.day109.designpatterns.prototypeNregistry.session;

import java.util.HashMap;

public class StudentRegistry {
    HashMap<String, Student> studentRegistry;
    public StudentRegistry(){
        studentRegistry = new HashMap<>();
    }

    public void put(String key, Student student){
        studentRegistry.put(key, student);
    }

    //nobody can touch the template object which is stored in the map.
    public Student get(String key){
        return studentRegistry.get(key).copy();
    }
}
