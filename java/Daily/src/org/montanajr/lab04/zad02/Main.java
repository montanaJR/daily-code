package org.montanajr.lab04.zad02;

public class Main {
    public static void main(String[] args) {
        Napoj cappuccino = new NapojExtended("Cappuccino");
        Dodatek mleczko = new DodatekExtended("Mleczko");
        cappuccino.setData("Cappuccino - mleko + kawa biała");
        mleczko.setData("Mleko 2%");
        cappuccino.setPrice(10d);
        mleczko.setPrice(5d);
        cappuccino.addDodatek(mleczko);
        System.out.println(cappuccino.getData());

    }
}
