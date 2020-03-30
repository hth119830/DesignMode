package creation.Builder.bb.c;

import creation.Builder.bb.a.Item;
import creation.Builder.bb.a.Packages;
import creation.Builder.bb.b.Papers;

public abstract class Burgurs implements Item{

    @Override
    public Packages packages() {
        return new Papers();
    }

}
