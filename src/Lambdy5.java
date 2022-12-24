import java.util.ArrayList;
import java.util.List;

public class Lambdy5 {
    interface FlowerPot
    {
        void showMyFlowers(String flower);
    }
    public static ArrayList<String>Flowers=new ArrayList<>(List.of("red roses","blue tulpis","orange neptunias","blue daisy"));
    public static void implementingMyFlowers(ArrayList<String>listOfFlowers, FlowerPot fp)
    {
        for(String flower: listOfFlowers)
        {
            fp.showMyFlowers(flower);
        }
    }

    public static void main(String[] args) {
        implementingMyFlowers(Flowers,(String beautiful)->
        {
            System.out.println(beautiful);
        });
    }
}
