package com.ajet.module10.day107.assignment.designpatterns.singleton.SingletonPool;

public class DatabaseConnection {
    private boolean isAvailable;

    public DatabaseConnection() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

