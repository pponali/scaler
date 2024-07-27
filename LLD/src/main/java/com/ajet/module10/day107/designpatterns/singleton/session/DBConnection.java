package com.ajet.module10.day107.designpatterns.singleton.session;

/**
 * Author prakashponali @pponali
 * <p>
 * Date   22/07/24 9:08 am
 */
public class DBConnection {

    private static DBConnection instance;
    private String url;
    private String username;

    private DBConnection() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        this.username = "XXXX";
    }

    public static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class) {
                if (instance == null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
