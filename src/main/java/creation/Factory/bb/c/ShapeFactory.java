package creation.Factory.bb.c;

import creation.Factory.bb.a.Shape;
import creation.Factory.bb.b.Circle;
import creation.Factory.bb.b.Rectangle;
import creation.Factory.bb.b.Square;

public class ShapeFactory {
    public static Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
