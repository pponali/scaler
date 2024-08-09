package com.ajet.module10.day112.designpatterns.decorator.assignment.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImpl implements FlyweightRegistry {

    private final Map<String, UserIntrinsicState> flyweights = new HashMap<>();

    @Override
    public void addFlyweight(UserIntrinsicState flyweight) {
        flyweights.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        return flyweights.get(email);
    }
}
