package com.ajet.module10.day112.designpatterns.decorator.assignment.flyweight;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}