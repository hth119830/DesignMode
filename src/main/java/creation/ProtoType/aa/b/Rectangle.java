package creation.ProtoType.aa.b;

import creation.ProtoType.aa.a.Shape;

public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw(){
        System.out.println("Rectangle : draw()");
    }


}
