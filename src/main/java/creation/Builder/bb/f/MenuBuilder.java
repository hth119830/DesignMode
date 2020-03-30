package creation.Builder.bb.f;

import creation.Builder.bb.d.Coke;
import creation.Builder.bb.d.MeatBurgur;
import creation.Builder.bb.d.VergerBurgur;
import creation.Builder.bb.e.Menu;

public class MenuBuilder {

    public Menu getmeat(){
        Menu menu = new Menu();
        menu.addItem(new MeatBurgur());
        menu.addItem(new Coke());
        menu.addItem(new VergerBurgur());
        return menu;
    }


}
