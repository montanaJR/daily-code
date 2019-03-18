package org.montanajr.lab03.zad03;

public class StudentSR extends Student {
    public StudentSR() {
        id = 2;
        opis = "Student 2";
    }

    @Override
    public String rodzajStypendiow() {
        return "Stypendia rektora";
    }
}
