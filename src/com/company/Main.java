package com.company;

public class Main {



    public static void main(String[] args) {

        Programmer programmer=new Programmer("Fille");
        System.out.println(programmer);
        Programmer.coding();

        Dancer dancer=new Dancer("dddddd");
        System.out.println(dancer);
        dancer.dancing();

        Singer singer=new Singer("lllllllll");
        System.out.println(singer);
        singer.singing();
        singer.playgitar();


    }
}
