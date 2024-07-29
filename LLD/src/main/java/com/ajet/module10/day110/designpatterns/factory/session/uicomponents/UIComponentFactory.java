package com.ajet.module10.day110.designpatterns.factory.session.uicomponents;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;
import com.ajet.module10.day110.designpatterns.factory.session.menu.IOsMenu;

public interface UIComponentFactory {
    public UIComponent createButtonComponent();
    public UIComponent createMenuComponent();
    public UIComponent createDropdownComponent();

}
