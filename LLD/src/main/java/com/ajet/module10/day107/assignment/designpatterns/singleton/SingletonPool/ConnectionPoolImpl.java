package com.ajet.module10.day107.assignment.designpatterns.singleton.SingletonPool;

public class ConnectionPoolImpl implements ConnectionPool{

    @Override
    public void initializePool() {

    }

    @Override
    public DatabaseConnection getConnection() {
        return null;
    }

    @Override
    public void releaseConnection(DatabaseConnection connection) {

    }

    @Override
    public int getAvailableConnectionsCount() {
        return 0;
    }

    @Override
    public int getTotalConnectionsCount() {
        return 0;
    }
}
