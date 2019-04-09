package org.montanajr.kolo01.zad01;

public class ProjektPracy extends Praca {
    Student s1;


    public ProjektPracy(Student s1) {
        this.s1 = s1;
    }

    @Override
    public String getOpis() {
        return s1.getInfo() + " realizujacy prace projektowa";
    }
}
