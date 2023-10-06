package com.example;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {

    private static Warehouse instance;
    private final Set<User> users = new HashSet<>();
    private Warehouse() {}

    public static Warehouse getInstance() {
        if (instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {
    	users.remove(user);
    }

    public Set<User> getUsers() {
        return users;
    }
}
