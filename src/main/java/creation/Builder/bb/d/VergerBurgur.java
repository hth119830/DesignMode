package creation.Builder.bb.d;

import creation.Builder.aa.c.Burger;
import creation.Builder.bb.c.Burgurs;

public class VergerBurgur extends Burgurs {
    @Override
    public String name() {
        return "vergerBurgur";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}
