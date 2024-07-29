package com.ajet.module10.day110.designpatterns.factory.session.uicomponents;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;
import com.ajet.module10.day110.designpatterns.factory.session.button.AndroidButton;
import com.ajet.module10.day110.designpatterns.factory.session.dropdown.AndroidDropdown;
import com.ajet.module10.day110.designpatterns.factory.session.menu.AndroidMenu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public UIComponent createButtonComponent() {
        return new AndroidButton("Android Button");
    }

    @Override
    public UIComponent createMenuComponent() {
        return new AndroidMenu("Android Menu");
    }

    @Override
    public UIComponent createDropdownComponent() {
        return new AndroidDropdown("Android Dropdown");
    }
}
