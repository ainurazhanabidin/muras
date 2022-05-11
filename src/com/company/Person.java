package com.company;

public class Person  {
    private String name;
    private String destruktation;

    public Person(String name, String destruktation) {
        this.name = name;
        this.destruktation = destruktation;
    }

    static void learn(){
        System.out.println("yrdoo");
    }
    static void eat(){
        System.out.println("burger");
    }
    static void walk(){
        System.out.println("ui");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestruktation() {
        return destruktation;
    }

    public void setDestruktation(String destruktation) {
        this.destruktation = destruktation;
    }
}
