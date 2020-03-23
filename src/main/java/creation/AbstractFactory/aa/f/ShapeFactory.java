package creation.AbstractFactory.aa.f;

import creation.AbstractFactory.aa.a.Shape;
import creation.AbstractFactory.aa.b.Circle;
import creation.AbstractFactory.aa.b.Rectangle;
import creation.AbstractFactory.aa.b.Square;
import creation.AbstractFactory.aa.c.Color;
import creation.AbstractFactory.aa.e.AbstractFactory;
//创建扩展类AbstractFactory的工厂类，基于给定的信息生成实体类对象
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
