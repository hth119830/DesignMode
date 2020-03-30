package creation.AbstractFactory.bb.b;

import creation.AbstractFactory.bb.a.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
