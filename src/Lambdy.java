import java.util.ArrayList;
import java.util.List;

public class Lambdy {
    interface Interfejs{
        String pisanieZnakow(String lancuch);
    }
    public static ArrayList<String>listaZnakow= new ArrayList<>(List.of("polski","matematyka","francuski","hiszpanski","chemia"));
    public static void  metoda(ArrayList<String>lista,Interfejs interfejs)
    {
        for(String przedmiot:lista)
        {
            interfejs.pisanieZnakow(przedmiot);
        }
    }

    public static void main(String[] args) {
        metoda(listaZnakow,(String przedmiot)->
        {System.out.println(przedmiot);
            return przedmiot;
        });

    }
}
