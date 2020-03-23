package creation.Factory.aa;

import creation.Factory.aa.a.Shape;
import creation.Factory.aa.c.ShapeFactory;

//使用该工厂类，通过传递类型信息来获取实体类的对象
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的方法
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        //获取 square 的方法
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();
        //获取 rectangle 的方法
        Shape shape3 = shapeFactory.getShape("rectangle");
        shape3.draw();
    }

}
