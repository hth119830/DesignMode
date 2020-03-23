package creation.AbstractFactory.aa.g;

import creation.AbstractFactory.aa.e.AbstractFactory;
import creation.AbstractFactory.aa.f.ColorFactory;
import creation.AbstractFactory.aa.f.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
