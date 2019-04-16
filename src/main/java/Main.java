import db.Connect;
import interfaces.*;
import models.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Human> spartans = Arrays.asList(new Spartan("Franco",22,67,new UrinateSpartanImp(),new DrinkSpartanImp(),3),
               new Spartan("Ezequiel",20,80,new UrinateSpartanImp(),new DrinkSpartanImp(),1));
        List<Human> vikings= Arrays.asList(new Viking("Guido",22,64,new UrinateVikingImp(),new DrinkVikingImp(),3),
                 new Viking("Lucas",30,75,new UrinateVikingImp(),new DrinkVikingImp(),2));
        Human boss = new FinalBoss("JEFE", 50, 100, new UrinateVikingImp(), new DrinkSpartanImp(),1,2);
        Human sp = Utils.sortGetRandom(spartans);
        Human vk = Utils.sortGetRandom(vikings);

        Human winner = Utils.play(sp,vk);

        if (Objects.isNull(winner)){
            System.out.println("Juegue de nuevo !");
        }
        else{
            Connect.winnerBD(winner);
            Human finalWinner = Utils.play(boss, winner);
            if (Objects.isNull(finalWinner)){
                System.out.println("Juegue de nuevo !");
            }
            else{
                Connect.winnerBD(finalWinner);
            }
        }




    }
}
