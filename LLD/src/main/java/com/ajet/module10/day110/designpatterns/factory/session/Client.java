package com.ajet.module10.day110.designpatterns.factory.session;

import com.ajet.module10.day110.designpatterns.factory.session.platform.Platform;
import com.ajet.module10.day110.designpatterns.factory.session.platform.PlatformFactory;
import com.ajet.module10.day110.designpatterns.factory.session.uicomponents.UIComponentFactory;

public class Client {
    public static void main(String[] args) {


        Platform platform = PlatformFactory.getPlatformInstance(null);
        UIComponentFactory uiComponentFactory = platform.createUIComponentFactory();
        UIComponent uiComponent = uiComponentFactory.createMenuComponent();
        System.out.println(uiComponent.getClass().getSimpleName());

    }
}
