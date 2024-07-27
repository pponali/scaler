package com.ajet.module10.day109.designpatterns.prototypeNregistry.assignment.prototypeconfiguration;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    private Map<ConfigurationType, Configuration> prototypes = new HashMap<>();

    @Override
    public void addPrototype(Configuration user) {
        prototypes.put(user.getType(), user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return prototypes.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = prototypes.get(type);
        if(prototype != null) {
            return prototype.cloneObject();
        }
        return null;

    }
}
