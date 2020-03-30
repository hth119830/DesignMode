package creation.Factory.bb.b;

import creation.Factory.bb.a.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle : draw()");
    }
}
