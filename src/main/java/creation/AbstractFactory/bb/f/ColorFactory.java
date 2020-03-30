package creation.AbstractFactory.bb.f;

import creation.AbstractFactory.bb.a.Shape;
import creation.AbstractFactory.bb.b.Circle;
import creation.AbstractFactory.bb.b.Rectangle;
import creation.AbstractFactory.bb.b.Square;
import creation.AbstractFactory.bb.c.Color;
import creation.AbstractFactory.bb.d.Blue;
import creation.AbstractFactory.bb.d.Green;
import creation.AbstractFactory.bb.d.Red;
import creation.AbstractFactory.bb.e.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("red")) {
            return new Red();
        } else if (type.equalsIgnoreCase("green")) {
            return new Green();
        } else if (type.equalsIgnoreCase("blue")) {
            return new Blue();
        }
        return null;
    }
}
