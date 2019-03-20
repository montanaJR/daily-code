package org.montanajr.lab03.zad03;

public class Uczelnia {

    public static void main(String[] args) {
        Student s1 = new StudentSN();
        System.out.println(s1.getOpis() + " pobiera " + s1.rodzajStypendiow());

        Student s2 = new StudentSS();
        s2 = new StypendiaRektora(s2);
        s2 = new StypendiaNaukowe(s2);
        System.out.println(s2.getOpis() + " pobiera " + s2.rodzajStypendiow());


    }


}
