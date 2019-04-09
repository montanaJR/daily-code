package org.montanajr.kolo01.zad01;

public class ProjektPrzedmiotowy extends Praca {

    Student s1;

    public ProjektPrzedmiotowy(Student s1) {
        this.s1 = s1;
    }

    public String getOpis() {
        return s1.getInfo() + " realizujacy prace dyplomowa";
    }
}
