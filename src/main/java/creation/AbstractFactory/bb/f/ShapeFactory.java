package creation.AbstractFactory.bb.f;

import creation.AbstractFactory.bb.b.Rectangle;
import creation.AbstractFactory.bb.a.Shape;
import creation.AbstractFactory.bb.b.Circle;
import creation.AbstractFactory.bb.b.Square;
import creation.AbstractFactory.bb.c.Color;
import creation.AbstractFactory.bb.e.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        } else if (type.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
