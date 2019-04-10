package org.montanajr.lab06.zad01;

public class Book implements Product {

    public Book() {
        System.out.println("Book was created");
    }

    @Override
    public void present(String nazwa) {
        System.out.println(String.format("Name: %s",nazwa));
    }
}
