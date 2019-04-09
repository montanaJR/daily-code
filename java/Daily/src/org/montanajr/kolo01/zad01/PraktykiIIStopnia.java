package org.montanajr.kolo01.zad01;

public class PraktykiIIStopnia extends DecoratorPraktyk {
    Student s;

    public PraktykiIIStopnia(Student s) {
        this.s = s;
    }

    @Override
    public String getOpis() {
        return s.getInfo() + ", realizujący praktyki drugiego stopnia";
    }
}
