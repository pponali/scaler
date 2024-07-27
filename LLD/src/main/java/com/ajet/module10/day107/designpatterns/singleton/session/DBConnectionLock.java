package com.ajet.module10.day107.designpatterns.singleton.session;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   22/07/24 9:08 am
 */
public class DBConnectionLock {

    private static DBConnectionLock instance;
    private String url;
    private String username;
    static Lock lock = new ReentrantLock();

    private DBConnectionLock() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "XXXX";
    }

    public static DBConnectionLock getInstance() {
        if(instance == null) {
            lock.lock();
                if (instance == null) {
                    instance = new DBConnectionLock();
                }
            lock.unlock();
        }
        return instance;
    }
}
