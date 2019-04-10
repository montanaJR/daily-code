package org.montanajr.lab06.zad01;

public class Calendar implements Product {

    public Calendar() {
        System.out.println("Calendar was created");
    }

    @Override
    public void present(String nazwa) {
        System.out.println(String.format("Name: %s",nazwa));
    }
}
