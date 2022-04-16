package com.company;

public class User {
    String name = "Алексей";
    int age = 42;
    int weight = 80;

    public User(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public void eat() {
        System.out.println("Я ем");

    }

    public void dayofbirth() {
        age++;
        System.out.println(age);
//int age = age +1;

    }
}
