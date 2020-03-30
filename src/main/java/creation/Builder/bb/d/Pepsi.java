package creation.Builder.bb.d;

import creation.Builder.bb.c.ColdDrink;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
