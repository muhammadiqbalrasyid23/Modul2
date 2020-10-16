package com.MuhammadIqbalRasyid.Modul2.Polimorfismo;

public class DemoOverRiding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
