package creation.AbstractFactory.aa.b;


import creation.AbstractFactory.aa.a.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle : draw()");
    }
}
