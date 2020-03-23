package creation.Factory.aa.c;

import com.sun.org.apache.regexp.internal.RE;
import creation.Factory.aa.a.Shape;
import creation.Factory.aa.b.Circle;
import creation.Factory.aa.b.Rectangle;
import creation.Factory.aa.b.Square;

//创建一个工厂类，生成基于给定信息的实体对象类
public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

}
