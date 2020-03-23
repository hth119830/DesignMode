package creation.Builder.aa.c;

import creation.Builder.aa.a.Item;
import creation.Builder.aa.a.Packing;
import creation.Builder.aa.b.Bottle;
//创建Item接口的冷饮抽象类，该类提供了默认的功能
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
