package com.example.demo.constants;

public enum Engine {
    Gasoline(0),
    Diesel(1),
    Electric(2),
    Hybrid(4);

    private final int value;

    Engine(int value){this.value =value;}
    public int getValue(){return value;}
}
