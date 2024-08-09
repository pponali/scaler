package com.ajet.module10.day110.designpatterns.factory.session.button;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;

public class AndroidButton implements UIComponent {
    private String text;

    public AndroidButton(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}