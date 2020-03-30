package creation.AbstractFactory.bb.d;

import creation.AbstractFactory.bb.c.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue : fill()");
    }
}
