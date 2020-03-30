package creation.Factory.bb.b;

import creation.Factory.bb.a.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
