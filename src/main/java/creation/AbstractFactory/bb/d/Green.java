package creation.AbstractFactory.bb.d;

import creation.AbstractFactory.bb.c.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Green : fill()");
    }
}
