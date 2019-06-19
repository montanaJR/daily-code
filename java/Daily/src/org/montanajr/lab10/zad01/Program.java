package org.montanajr.lab10.zad01;

public class Program {
    public static void main(String[] args) {
        Trip trip = new Bus();
        trip.calculate("Cracow","Warsaw");
        System.out.println();

        trip = new Train();
        trip.calculate("Lublin", "Wroclaw");
    }
}
