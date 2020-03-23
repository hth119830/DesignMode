package creation.Builder.aa;

import creation.Builder.aa.e.Meal;
import creation.Builder.aa.f.MealBuilder;

public class BuilderPattern {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg Meal");
        vegMeal.showItems();
        System.out.println("veg Total Cost :"+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.PrepareNonVegMeal();
        System.out.println("chicken Meal");
        nonVegMeal.showItems();
        System.out.println("chicken Total Cost :"+nonVegMeal.getCost());


    }
}
