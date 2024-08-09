package com.ajet.module10.day112.designpatterns.decorator.assignment.flyweight;

import lombok.Getter;

@IntrinsicState
@Getter
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}
