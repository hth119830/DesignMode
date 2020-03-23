package creation.Builder.aa.c;

import creation.Builder.aa.a.Item;
import creation.Builder.aa.a.Packing;
import creation.Builder.aa.b.Wrapper;
//创建Item接口的汉堡抽象类，该类提供了默认的功能
public abstract class Burger implements Item {


    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
