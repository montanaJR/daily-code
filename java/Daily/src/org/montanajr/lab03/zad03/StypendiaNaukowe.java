package org.montanajr.lab03.zad03;

public class StypendiaNaukowe extends DekoratorStypendiow{
    Student student;

    public StypendiaNaukowe(Student student) {
        this.student = student;
    }

    @Override
    public String getOpis() {
        return student.getOpis();
    }

    @Override
    public int getId() {
        return student.getId();
    }

    @Override
    public String rodzajStypendiow() {
        return student.rodzajStypendiow() + " oraz stypendia naukowe";
    }
}
