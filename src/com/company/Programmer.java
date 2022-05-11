package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer (String companyName) {
        super("programmist","director");

        this.companyName = companyName;
    }

    static void coding(){
        System.out.println("kod jazuu");
    }



    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                "companyName='" + getName()+ '\'' +
                "companyName='" + getDestruktation() + '\'' +
                '}';
    }
}
