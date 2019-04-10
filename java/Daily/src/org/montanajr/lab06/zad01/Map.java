package org.montanajr.lab06.zad01;

public class Map implements Product {

    public Map() {
        System.out.println("Map was created");
    }

    @Override
    public void present(String nazwa) {
        System.out.println(String.format("Name: %s", nazwa));
    }
}
