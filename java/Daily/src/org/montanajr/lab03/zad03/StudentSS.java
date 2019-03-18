package org.montanajr.lab03.zad03;

public class StudentSS extends Student {
    public StudentSS() {
        id = 3;
        opis = "Student 3";
    }

    @Override
    public String rodzajStypendiow() {
        return "Stypendia socjalne";
    }
}
