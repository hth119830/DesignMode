package creation.ProtoType.aa.b;

import creation.ProtoType.aa.a.Shape;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle : draw()");
    }
}
