package creation.Factory.aa.b;

import creation.Factory.aa.a.Shape;

//具体实现类
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
