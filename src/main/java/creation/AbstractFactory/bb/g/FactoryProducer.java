package creation.AbstractFactory.bb.g;

import creation.AbstractFactory.bb.e.AbstractFactory;
import creation.AbstractFactory.bb.f.ColorFactory;
import creation.AbstractFactory.bb.f.ShapeFactory;
import creation.Factory.aa.a.Shape;

public class FactoryProducer {
    public static AbstractFactory getAbstractFactory(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if(type.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }

}
