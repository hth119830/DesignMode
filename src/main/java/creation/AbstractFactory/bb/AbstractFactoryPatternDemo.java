package creation.AbstractFactory.bb;

import creation.AbstractFactory.bb.e.AbstractFactory;
import creation.AbstractFactory.bb.g.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getAbstractFactory("color");
        colorFactory.getColor("blue").fill();
        AbstractFactory shapeFactory = FactoryProducer.getAbstractFactory("shape");
        shapeFactory.getShape("circle").draw();

    }
}
