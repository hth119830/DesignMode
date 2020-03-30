package creation.Builder.bb;

import creation.Builder.bb.e.Menu;
import creation.Builder.bb.f.MenuBuilder;

public class BuilderpatternDemo {

    public static void main(String[] args) {
        MenuBuilder menuBuilder = new MenuBuilder();
        Menu menu = menuBuilder.getmeat();
        menu.printss();

    }
}
