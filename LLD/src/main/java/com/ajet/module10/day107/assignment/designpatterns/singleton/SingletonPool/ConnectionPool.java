package com.ajet.module10.day107.assignment.designpatterns.singleton.SingletonPool;

public interface ConnectionPool {

    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();

}
