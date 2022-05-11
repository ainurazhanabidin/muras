package com.company;

public class Singer extends Person{
    private String bandname;

    public Singer(String bandname) {
        super("eeeeee", "kkkkkkk");
        this.bandname=bandname;
    }
       void singing() {
           System.out.println("yrdayt");
       }

       void playgitar(){
           System.out.println("gitarada oinoit");
       }

    @Override
    public String toString() {
        return "Singer{" +
                "bandname='" + bandname + '\'' +
                '}';
    }
}
