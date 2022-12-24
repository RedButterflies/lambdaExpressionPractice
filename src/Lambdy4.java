import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.List;

public class Lambdy4 {
    interface Meal
    {
        void presentTheMeal(String dish);
    }
    public static ArrayList<String>foodOptions= new ArrayList<>(List.of("tacos","pizza","salami sandwich","pancakes"));
    public static void implementingTheInterface(ArrayList<String>listOfMeals,Meal m)
    {
        for(String dish: listOfMeals)
        {
            m.presentTheMeal(dish);
        }
    }

    public static void main(String[] args) {
        implementingTheInterface(foodOptions,(String dish)->{
            System.out.println(dish);
        });
    }
}
