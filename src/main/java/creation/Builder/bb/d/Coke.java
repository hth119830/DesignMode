package creation.Builder.bb.d;

import creation.Builder.bb.c.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
