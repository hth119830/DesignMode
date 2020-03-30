package creation.Factory.bb;

import creation.Factory.aa.b.Circle;
import creation.Factory.bb.a.Shape;
import creation.Factory.bb.c.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory.getShape("circle").draw();
        ShapeFactory.getShape("square").draw();
        ShapeFactory.getShape("rectangle").draw();


    }
}
