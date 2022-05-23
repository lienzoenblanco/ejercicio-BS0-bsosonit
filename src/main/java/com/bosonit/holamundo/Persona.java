package com.bosonit.holamundo;

public class Persona {
    private final String name;
    private int age;
    private final String city;

    public Persona(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void addAge() {
        this.age = this.age + 1;
    }
}
