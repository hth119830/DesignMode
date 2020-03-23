package creation.AbstractFactory.aa.b;


import creation.AbstractFactory.aa.a.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square : draw()");
    }
}
