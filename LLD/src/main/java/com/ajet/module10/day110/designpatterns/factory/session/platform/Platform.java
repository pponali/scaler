package com.ajet.module10.day110.designpatterns.factory.session.platform;

import com.ajet.module10.day110.designpatterns.factory.session.UIComponent;
import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.UIComponentFactory;

public abstract class Platform {
    /*public abstract UIComponent createButtonComponent();
    public abstract UIComponent createMenuComponent();
    public abstract UIComponent createDropdownComponent();*/

    public abstract UIComponentFactory createUIComponentFactory();;
}
