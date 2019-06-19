package org.montanajr.lab10.zad01;

public abstract class Trip {
    abstract void setTime();
    abstract void setPrice();
    abstract void getCities(String... cities);

    public final void calculate(String ...args)
    {
        System.out.println("Trip calculation started");
        setTime();
        setPrice();
        getCities(args);
    }
}
