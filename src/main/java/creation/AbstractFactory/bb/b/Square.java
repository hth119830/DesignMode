package creation.AbstractFactory.bb.b;

import creation.AbstractFactory.bb.a.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square : draw()");
    }
}
