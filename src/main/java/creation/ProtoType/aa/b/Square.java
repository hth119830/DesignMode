package creation.ProtoType.aa.b;

import creation.ProtoType.aa.a.Shape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square : draw()");
    }

    public Square() {
        type = "Square";
    }
}
