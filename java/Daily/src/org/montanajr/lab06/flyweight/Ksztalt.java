package org.montanajr.lab06.flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Ksztalt 
 {
	public void rysuj(Graphics g, int x, int y, int width, int height, Color kolor);
 }