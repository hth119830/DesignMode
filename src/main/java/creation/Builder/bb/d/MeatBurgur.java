package creation.Builder.bb.d;


import creation.Builder.bb.c.Burgurs;

public class MeatBurgur extends Burgurs{
    @Override
    public String name() {
        return "meatBurgur";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
