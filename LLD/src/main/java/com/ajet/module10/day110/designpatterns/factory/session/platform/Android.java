package com.ajet.module10.day110.designpatterns.factory.session.platform;

import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.AndroidUIComponentFactory;
import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.UIComponentFactory;

public class Android extends Platform {
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
