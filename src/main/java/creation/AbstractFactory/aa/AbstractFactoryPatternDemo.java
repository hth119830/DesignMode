package creation.AbstractFactory.aa;

import creation.AbstractFactory.aa.a.Shape;
import creation.AbstractFactory.aa.c.Color;
import creation.AbstractFactory.aa.e.AbstractFactory;
import creation.AbstractFactory.aa.g.FactoryProducer;


//使用FactoryProducer 来获取 AbstractFactory ，通过传递类型信息来获取实体类的对象
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        //获取形状的工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        //获取为Circle 的对象
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        //获取Square 的对象
        Shape square = shapeFactory.getShape("square");
        square.draw();
        //获取Rectangle 对象
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        //获取Red对象
        Color red = colorFactory.getColor("red");
        red.fill();
        //获取Green对象
        Color green = colorFactory.getColor("green");
        green.fill();
        //获取Blue对象
        Color blue = colorFactory.getColor("blue");
        blue.fill();






    }
}
