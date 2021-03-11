package com.example.appnavigation;

import java.io.Serializable;
import java.util.UUID;

public class Produto implements Serializable {

    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
