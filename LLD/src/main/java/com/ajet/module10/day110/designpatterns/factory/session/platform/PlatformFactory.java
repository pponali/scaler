package com.ajet.module10.day110.designpatterns.factory.session.platform;

public class PlatformFactory {

    public static Platform getPlatformInstance(String platform) {
        if(platform == null)
            return new IOS();
        if (platform.equalsIgnoreCase("android")) {
            return new Android();
        } else if (platform.equalsIgnoreCase("ios")) {
            return new IOS();
        }
        return new IOS();
    }
}
