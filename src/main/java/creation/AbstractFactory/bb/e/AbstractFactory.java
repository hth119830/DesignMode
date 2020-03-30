package creation.AbstractFactory.bb.e;

import creation.AbstractFactory.bb.a.Shape;
import creation.AbstractFactory.bb.c.Color;

public abstract class AbstractFactory {
    public abstract Shape getShape(String type);
    public abstract Color getColor(String type);
}
