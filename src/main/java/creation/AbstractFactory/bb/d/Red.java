package creation.AbstractFactory.bb.d;

import creation.AbstractFactory.bb.c.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red : fill()");
    }
}
