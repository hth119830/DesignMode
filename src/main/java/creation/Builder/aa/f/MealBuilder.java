package creation.Builder.aa.f;

import creation.Builder.aa.d.ChickenBurger;
import creation.Builder.aa.d.Coke;
import creation.Builder.aa.d.Pepsi;
import creation.Builder.aa.d.VegBurger;
import creation.Builder.aa.e.Meal;

//创建一个MealBuilder 类，实际的builder类负责创建对象
//这个其实就是service方法，实际业务类，负责模拟现实中的各种情况
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal PrepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
