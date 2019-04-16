import models.*;

import java.util.Random;
import java.util.List;
import java.util.Comparator;

public class Utils {


    public static Human sortGetRandom(List<Human> Humans){
        Random rand = new Random();
        return Humans.stream()
                .sorted(Comparator.comparing(human -> human.getAge()))
                .skip(rand.nextInt(Humans.size()))
                .findAny()
                .get();
    }



    public static Human play(Human player1, Human player2){

        System.out.println("-----------------EMPIEZA EL JUEGO----------------");
        System.out.println(player1 + "   ------VS------   " + player2);

        while (player1.getLife() > 0 && player2.getLife() > 0)
        {

            player1.Drink();
            player2.Drink();
            player1.Urinate();
            player2.Urinate();

            if(player1.getLife() <= 0 && player2.getLife() > 0){
                System.out.println("Ganador: " + player2);
                player2.resetLife();
                return player2;
            }
            else if (player2.getLife() <= 0 && player1.getLife() > 0){
                System.out.println("Ganador: " + player1);
                player1.resetLife();
                return player1;
            }
            else if(player1.getLife() <= 0 && player2.getLife() <= 0){
                System.out.println("EMPATE");
                return null;
            }
            else{
                System.out.println(" Vida Jugador " + player1.getName()+ " " + player1.getLife() + " ---- " +" Vida Jugador "+ player2.getName() +" "+ player2.getLife());
            }
        }
        return null;
    }



}
