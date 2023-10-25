package com.example.demo.constants;

public enum Category {
    Car(0),
    Buss(1),
    Truck(2),
    Motorcycle(3);

    private final int value;

    Category(int value){this.value = value;}

    public int getValue(){return value;}
}
