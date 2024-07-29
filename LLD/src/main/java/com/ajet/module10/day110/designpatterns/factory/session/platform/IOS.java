package com.ajet.module10.day110.designpatterns.factory.session.platform;

import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.IOSUIComponentFactory;
import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.UIComponentFactory;

public class IOS extends Platform {
    public UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
