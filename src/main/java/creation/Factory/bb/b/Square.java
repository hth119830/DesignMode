package creation.Factory.bb.b;

import creation.Factory.bb.a.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : draw()");
    }
}
