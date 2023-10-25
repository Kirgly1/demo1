package com.example.demo.constants;

public enum Transmission {

    Manual("manual"),
    Automatic("automatic");

    private String value;

    Transmission(String value){this.value = value;}

    public String getValue(){return value;}
}
