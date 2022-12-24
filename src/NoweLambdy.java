import java.util.ArrayList;
import java.util.List;

public class NoweLambdy {
    interface Piesek
    {
        void napis (String napis);
    }
    public static ArrayList<String>lista=new ArrayList<>(List.of("labrador","chihuahua","York","pudel","sausage dog","pekinczyk"));
    public static void wypisaniePieskow(ArrayList<String>pieski,Piesek pk)
    {
        for(String pies:pieski)
        {
            pk.napis(pies);
        }
    }

    public static void main(String[] args) {
        wypisaniePieskow(lista,(String doggy)->{
            System.out.println(doggy);
        });
    }
}
