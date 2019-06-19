package org.montanajr.lab10.zad01;

public class Program {
    public static void main(String[] args) {
        Trip trip = new Bus();
        trip.calculate(350, "Cracow","Warsaw");
        System.out.println();

        trip = new Train();
        trip.calculate(600, "Lublin", "Wroclaw");
    }
}
