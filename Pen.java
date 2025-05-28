package org.example;

public class Pen implements Writer{

    public Pen() {
        System.out.println("Pen cons");
    }

    public void write(){
        System.out.println("writing using pen");
    }

}
