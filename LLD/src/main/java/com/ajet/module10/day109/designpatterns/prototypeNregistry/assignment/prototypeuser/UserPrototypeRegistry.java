package com.ajet.module10.day109.designpatterns.prototypeNregistry.assignment.prototypeuser;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}

