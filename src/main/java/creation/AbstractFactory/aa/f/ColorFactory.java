package creation.AbstractFactory.aa.f;

import creation.AbstractFactory.aa.a.Shape;
import creation.AbstractFactory.aa.c.Color;
import creation.AbstractFactory.aa.d.Blue;
import creation.AbstractFactory.aa.d.Green;
import creation.AbstractFactory.aa.d.Red;
import creation.AbstractFactory.aa.e.AbstractFactory;
//创建扩展类 AbstractFactory 的工厂类，基于给定信息生成实体类的对象
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
