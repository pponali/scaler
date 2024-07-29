package com.ajet.module10.day110.designpatterns.factory.session.menu;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;

public class AndroidMenu implements UIComponent {
    private String text;

    public AndroidMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
