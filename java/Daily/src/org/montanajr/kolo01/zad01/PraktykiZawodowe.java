package org.montanajr.kolo01.zad01;

public class PraktykiZawodowe extends Praktyki{

    Student s;

    public PraktykiZawodowe(Student s) {
        this.s = s;
    }

    @Override
    public String getOpis() {
        return s.getInfo() + ", zawodowe";
    }
}
