package com.example.buoi5;

public class User {
    private int resourceid;
    private String name;
    private String type;
    private String price;

    public User() {
    }

    public User(int resourceid, String name, String type, String price) {
        this.resourceid = resourceid;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
