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
            int life1 = player1.getLife();
            int life2 = player2.getLife();

            if( player1 instanceof Spartan){
                ((Spartan)player1).executeDrink();
                ((Spartan)player1).executeUrinate();
            }
            else{
                ((Viking)player1).executeDrink();
                ((Viking)player1).executeUrinate();
            }

            if(player2 instanceof Viking){
                ((Viking)player2).executeDrink();
                ((Viking)player2).executeUrinate();
            }
            else{
                ((Spartan)player2).executeDrink();
                ((Spartan)player2).executeUrinate();
            }

            if(player1.getLife() <= 0 && player2.getLife() > 0){
                System.out.println("Ganador: " + player2);
                return player2;
            }
            else if (player2.getLife() <= 0 && player1.getLife() > 0){
                System.out.println("Ganador: " + player1);
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
