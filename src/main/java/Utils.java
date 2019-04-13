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
        /*System.out.println("-----JUGADOR 1-----");
        System.out.println(player1);
        System.out.println("-----JUGADOR 2-----");
        System.out.println(player2);*/
        System.out.println(player1 + "   ------VS------   " + player2);


        while (player1.getLife() > 0 && player2.getLife() > 0)
        {
            int life1 = player1.getLife();
            int life2 = player2.getLife();


            life1 =  life1 - ((Spartan)player1).executeDrink();
            life1 = life1 - ((Spartan)player1).executeUrinate();

            life2 = life2 - ((Viking)player2).executeDrink();
            life2 = life2 - ((Viking)player2).executreUrinate();

            player1.setLife(life1);
            player2.setLife(life2);

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
