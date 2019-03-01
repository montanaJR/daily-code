package org.montanajr.vector.impl;

import org.montanajr.vector.AbstractVector;

public class Vector extends AbstractVector {
    private double x;
    private double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected Vector add(Vector other) {
        return new Vector(x + other.x, y + other.y);
    }

    @Override
    protected Vector sub(Vector other) {
        return new Vector(x - other.x, y - other.y);
    }


}