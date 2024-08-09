package com.ajet.module10.day112.designpatterns.decorator.assignment.flyweight;

import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {
    private int currentGameStreak;
    private Colour colour;
    private UserIntrinsicState intrinsicState;
}