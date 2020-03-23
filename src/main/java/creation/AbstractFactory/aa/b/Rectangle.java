package creation.AbstractFactory.aa.b;


import creation.AbstractFactory.aa.a.Shape;

//具体实现类
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle : draw()");
    }
}
