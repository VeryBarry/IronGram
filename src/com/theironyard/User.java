package com.theironyard;

/**
 * Created by VeryBarry on 10/18/16.
 */
public class User {
    Integer id;
    String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
