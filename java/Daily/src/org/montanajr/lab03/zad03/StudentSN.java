package org.montanajr.lab03.zad03;

public class StudentSN extends Student {
    public StudentSN() {
        id = 1;
        opis = "Student 1";
    }

    @Override
    public String rodzajStypendiow() {
        return "Stypendia naukowe";
    }
}
