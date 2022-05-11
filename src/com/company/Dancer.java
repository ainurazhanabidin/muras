package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer( String groupName) {
        super("aaaaa","bbbbbbb");
        this.groupName = groupName;
    }

     void dancing(){
        System.out.println("biyleit");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}

