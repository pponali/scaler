package com.ajet.module10.day110.designpatterns.factory.session.uicomponents;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;
import com.ajet.module10.day110.designpatterns.factory.session.button.IOsButton;
import com.ajet.module10.day110.designpatterns.factory.session.dropdown.IOsDropdown;
import com.ajet.module10.day110.designpatterns.factory.session.menu.IOsMenu;

public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public UIComponent createButtonComponent() {
        return new IOsButton("IOs Button");
    }

    @Override
    public UIComponent createMenuComponent() {
        return new IOsMenu("IOs Menu");
    }

    @Override
    public UIComponent createDropdownComponent() {
        return new IOsDropdown("IOs Dropdown");
    }
}
