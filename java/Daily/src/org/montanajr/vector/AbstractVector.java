package org.montanajr.vector;

import org.montanajr.vector.impl.Vector;

public abstract class AbstractVector {

    protected abstract Vector add(Vector other);
    protected abstract Vector sub(Vector other);

}
