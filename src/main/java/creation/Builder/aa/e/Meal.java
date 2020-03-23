package creation.Builder.aa.e;

import creation.Builder.aa.a.Item;

import java.util.ArrayList;
import java.util.List;

//创建一个Meal（一餐）类，带有上面定义的Item对象
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item :
                items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item :
                items) {
            System.out.println("Item : " + item.name());
            System.out.println(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }

    }


}
