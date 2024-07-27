package com.ajet.module10.day107.designpatterns.singleton.assignment.SingletonPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {
    private static ConnectionPoolImpl instance;
    private final List<DatabaseConnection> connections;
    private final int maxConnections;

    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        this.connections = new ArrayList<>();
        initializePool();
    }

    public static synchronized ConnectionPoolImpl getInstance(int maxConnections) {
        if (instance == null) {
            instance = new ConnectionPoolImpl(maxConnections);
        }
        return instance;
    }

    public static synchronized void resetInstance() {
        instance = null;
    }

    @Override
    public void initializePool() {
        for (int i = 0; i < maxConnections; i++) {
            connections.add(new DatabaseConnection());
        }
    }

    @Override
    public synchronized DatabaseConnection getConnection() {
        for (DatabaseConnection connection : connections) {
            if (connection.isAvailable()) {
                connection.setAvailable(false);
                return connection;
            }
        }
        return null; // or throw an exception if preferred
    }

    @Override
    public synchronized void releaseConnection(DatabaseConnection connection) {
        connection.setAvailable(true);
    }

    @Override
    public synchronized int getAvailableConnectionsCount() {
        int count = 0;
        for (DatabaseConnection connection : connections) {
            if (connection.isAvailable()) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public synchronized int getTotalConnectionsCount() {
        return connections.size();
    }
}

