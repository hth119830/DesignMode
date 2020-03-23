package creation.AbstractFactory.aa.d;

import creation.AbstractFactory.aa.c.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red : fill()");
    }
}
