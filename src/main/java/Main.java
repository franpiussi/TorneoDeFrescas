import java.util.*;

public class Main {

    public static void main(String[] args) {

        UrinateSpartanImp urinateSpartanImp = new UrinateSpartanImp() ;
        UrinateVikingImp urinateVikingImp = new UrinateVikingImp();
        DrinkSpartanImp drinkSpartanImp = new DrinkSpartanImp();
        DrinkVikingImp drinkVikingImp = new DrinkVikingImp();

        List<Human> Spartans = Arrays.asList((Human)new Spartan("Franco",20,67,urinateSpartanImp,drinkSpartanImp,7),
                (Human) new Spartan("Ezequiel",25,80,urinateSpartanImp,drinkSpartanImp,5));
        List<Human> Vikings= Arrays.asList((Human)new Viking("Guido",22,64,urinateVikingImp,drinkVikingImp,3),
                (Human)  new Viking("Lucas",30,75,urinateVikingImp,drinkVikingImp,5));

        /*Viking vk = Utils.sortGetRandom(Vikings);

        Spartan sp = Utils.sortGetRandom(Spartans);*/

        Utils.Play(Spartans.get(0), Vikings.get(0));





    }
}
