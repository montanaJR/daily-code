package org.montanajr.kolo01.zad01;

public class PraktykiIStopnia extends DecoratorPraktyk {

   Student s;

    public PraktykiIStopnia(Student s) {
        this.s = s;
    }

    @Override
    public String getOpis() {
        return s.getInfo() + ", realizujący praktyki pierwszego stopnia";
    }
}
