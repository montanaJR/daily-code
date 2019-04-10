package org.montanajr.lab06.flyweight;

import java.awt.*;
import java.util.Arrays;

public class Polygon implements Ksztalt  {

    private boolean wypelnienie;


    public Polygon(boolean f)
    {
        this.wypelnienie=f;
        System.out.println("Tworzenie obiektu Polygon z wype�nieniem="+f);

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void rysuj(Graphics okrag, int x, int y, int width, int height, Color kolor)
    {
        int xx[] = {x};
        int yy[] = {y};
        okrag.setColor(kolor);
        okrag.drawPolygon(xx,yy, height);

        if(wypelnienie)
            okrag.fillPolygon(xx,yy, height);

    }
}
