package com.ajet.module10.day107.assignment.designpatterns.singleton.JavaSingletonExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   22/07/24 10:50 am
 * <p>
 * File based configuration manager
 * Problem Statement
 * You are tasked with creating a system-wide configuration manager for a complex software suite. The configuration manager is responsible for managing various configuration settings that affect the behavior and appearance of the software. To prevent multiple instances of the configuration manager, which could lead to inconsistencies and potential resource conflicts, you need to implement a design pattern that ensures the configuration manager is a singleton object.
 * <p>
 * Assignment
 * You are required to extend an abstract class FileBasedConfigurationManager to implement the Singleton design pattern and create a configuration manager class. The abstract class provides a foundation for managing configuration settings using a file-based approach.
 * <p>
 * Part 1: Implementing Singleton and Extending Abstract Class
 * Extend the FileBasedConfigurationManager abstract class: You already have an abstract class named FileBasedConfigurationManager. Your task is to extend this class to create your own configuration manager class.
 * <p>
 * Implement the Singleton design pattern: Within your configuration manager class, implement the Singleton design pattern to ensure that only one instance of your class can exist within the program.
 * <p>
 * Implement the getInstance() and resetInstance() methods: Implement the getInstance() and resetInstance() methods in your configuration manager class. The getInstance() method should return the singleton instance of your configuration manager class. The resetInstance() method should reset the singleton instance of your configuration manager class to null.
 * <p>
 * Part 2: Configuration Management
 * The FileBasedConfigurationManager abstract class provides a foundation for managing configuration settings using a file-based approach.
 * <p>
 * It already has a load method that loads configuration settings from a file and stores it in a Properties object. The Properties object is a collection of key-value pairs, where the key is a string and the value is an object.
 * <p>
 * Implement the following methods for configuration management in your extended class:
 * <p>
 * String getConfiguration(String key): Retrieve a configuration value based on a given key.
 * <T> T getConfiguration(String key, Class<T> type): Retrieve a configuration value and perform type conversion.
 * void setConfiguration(String key, String value): Set a configuration value.
 * <T> void setConfiguration(String key, T value): Set a configuration value with type checking.
 * void removeConfiguration(String key): Remove a configuration value based on a given key.
 * void clear(): Clear all configuration settings.
 */
public abstract class FileBasedConfigurationManager {


    protected final Properties properties;

    protected FileBasedConfigurationManager() {
        this.properties = new Properties();
    }

    public static FileBasedConfigurationManager getInstance() {
        //return instance
        return FileBasedConfigurationManagerImpl.getInstance();
    }

    public void load(String filePath) {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error while loading configuration file", e);
        }
    }

    protected static void resetInstance() {
        //reset instance

    }

    public abstract String getConfiguration(String key);

    public abstract <T> T getConfiguration(String key, Class<T> type);

    public abstract void setConfiguration(String key, String value);

    public abstract <T> void setConfiguration(String key, T value);

    public abstract void removeConfiguration(String key);

    public abstract void clear();

    protected Properties getProperties() {
        return properties;
    }

    protected <T> T convert(String value, Class<T> type) {
        System.out.println("Converting " + value + " to " + type.getSimpleName());
        switch (type.getSimpleName()) {
            case "Integer":
                return (T) Integer.valueOf(value);
            case "Long":
                return (T) Long.valueOf(value);
            case "Float":
                return (T) Float.valueOf(value);
            case "Double":
                return (T) Double.valueOf(value);
        }
        throw new UnsupportedOperationException("Invalid type: " + type.getSimpleName());
    }

}
