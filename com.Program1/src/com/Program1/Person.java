package com.Program1;

public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Main method
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
    }
}
