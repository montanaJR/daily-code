package org.montanajr.kolo01.zad01;

public class StudentII extends Student {

    public StudentII() {
        info = "Student pierwszego stopnia";
    }

    @Override
    public void realizujPraktyki(Praktyki p1) {
        System.out.println(p1.getInfoAboutPraktyki());
    }

}
