package com.example.demo.constants;

public enum Roles {
    User("user"),
    Admin("admin");

    private final String value;

    Roles(String value){this.value = value;}

    public String getValue(){return value;}

}
