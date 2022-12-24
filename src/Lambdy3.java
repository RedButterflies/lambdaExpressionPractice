import java.util.ArrayList;
import java.util.List;

public class Lambdy3 {
    interface Restaurant
    {
        void show(String menuItem);
    }
    public static ArrayList<String>menu=new ArrayList<>(List.of("shake","fries","burgers","salad","ice cream","strawberry cake"));
    public static void implementingTheInterface(ArrayList<String>list,Restaurant rest)
    {
        for(String item: list)
        {
            rest.show(item);
        }
    }

    public static void main(String[] args) {
        implementingTheInterface(menu,(String yum)->{
            System.out.println(yum);
        });
    }
}
