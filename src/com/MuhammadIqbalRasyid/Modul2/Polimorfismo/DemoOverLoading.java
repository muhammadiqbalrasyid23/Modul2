package com.MuhammadIqbalRasyid.Modul2.Polimorfismo;

public class DemoOverLoading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu("Yoru ni kakeru");
        Lagu lagu2 = new Lagu("Halu", "Feby");

        lagu1.getDataLagu();
        lagu2.getDataLagu();
    }
}
