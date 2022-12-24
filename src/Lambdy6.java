import java.util.ArrayList;
import java.util.List;

public class Lambdy6 {
    interface Christmas
    {
        void showMe(String prestent);
    }
    public static ArrayList<String>SantasBag= new ArrayList<>(List.of("a doll","yellow socks","a disco ball","a puppy","a doll house","a black kitten","chocolate bars"));
    public static void showingMyPresents(ArrayList<String>gifts,Christmas christmas)
    {
        for(String gift:gifts)
        {
            christmas.showMe(gift);
        }
    }

    public static void main(String[] args) {
        showingMyPresents(SantasBag,(String gift)->{
            System.out.println(gift);
        });
    }
}
