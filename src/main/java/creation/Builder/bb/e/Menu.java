package creation.Builder.bb.e;



import creation.Builder.bb.a.Item;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    float a = 0.0f;
    public float cost(){
        for (Item item:
             list) {
            a += item.price();
        }
        return a;
    }

    public void printss(){
        for (Item item:
                list) {
            System.out.println("burgur"+item.name());
            System.out.println("price"+item.price());
            System.out.println("packages"+item.packages().pName());
        }
        System.out.println("cost"+cost());
    }


}
