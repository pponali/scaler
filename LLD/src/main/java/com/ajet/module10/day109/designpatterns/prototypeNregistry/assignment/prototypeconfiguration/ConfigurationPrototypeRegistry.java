package com.ajet.module10.day109.designpatterns.prototypeNregistry.assignment.prototypeconfiguration;

public interface ConfigurationPrototypeRegistry {

    void addPrototype(Configuration user);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
