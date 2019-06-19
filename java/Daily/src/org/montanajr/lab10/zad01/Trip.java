package org.montanajr.lab10.zad01;

public abstract class Trip {
    abstract void setTime(Integer dist);
    abstract void setPrice(Integer dist);
    abstract void getCities(String... cities);

    public final void calculate(Integer distance, String ...args)
    {
        System.out.println("Trip calculation started");
        setTime(distance);
        setPrice(distance);
        getCities(args);
    }
}
