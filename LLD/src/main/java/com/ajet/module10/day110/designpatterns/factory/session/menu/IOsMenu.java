package com.ajet.module10.day110.designpatterns.factory.session.menu;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;

public class IOsMenu implements UIComponent {
    private String text;

    public IOsMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
