package com.SpringBoot.SignletonSTATICFActory;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    // Private constructor prevents instantiation
    private DatabaseConnection() {}

    // Static factory method
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database");
    }
}
