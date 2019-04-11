
import java.util.Random;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Utils {


    public static Human sortGetRandom(List<Human> Humans){
        Random rand = new Random();
        return Humans.stream()
                .sorted(Comparator.comparing(human -> human.getAge()))
                .skip(rand.nextInt(Humans.size()))
                .findFirst()
                .get();
    }



    public static void Play(Human player1, Human player2){

        System.out.println("-----------------EMPIEZA EL JUEGO----------------");
        System.out.println("-----JUGADOR 1-----");
        System.out.println(player1);
        System.out.println("-----JUGADOR 2-----");
        System.out.println(player2);
    }

}
