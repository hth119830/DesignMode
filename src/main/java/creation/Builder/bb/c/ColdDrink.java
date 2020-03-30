package creation.Builder.bb.c;

import creation.Builder.bb.a.Item;
import creation.Builder.bb.a.Packages;
import creation.Builder.bb.b.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packages packages() {
        return new Bottle();
    }
}
