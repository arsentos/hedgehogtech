package org.hedgehogtech.testtask.entity;

public class CheckUser {
    private String name;

    public CheckUser(String name) {
        this.name = name;
    }

    public CheckUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
