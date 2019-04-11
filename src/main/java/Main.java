import java.util.*;

public class Main {

    public static void main(String[] args) {

        UrinateSpartanImp urinateSpartanImp = new UrinateSpartanImp() ;
        UrinateVikingImp urinateVikingImp = new UrinateVikingImp();
        DrinkSpartanImp drinkSpartanImp = new DrinkSpartanImp();
        DrinkVikingImp drinkVikingImp = new DrinkVikingImp();

        List<Human> spartans = Arrays.asList((Human)new Spartan("Franco",22,67,urinateSpartanImp,drinkSpartanImp,7),
                (Human) new Spartan("Ezequiel",20,80,urinateSpartanImp,drinkSpartanImp,5));
        List<Human> vikings= Arrays.asList((Human)new Viking("Guido",22,64,urinateVikingImp,drinkVikingImp,3),
                (Human)  new Viking("Lucas",30,75,urinateVikingImp,drinkVikingImp,5));



        Spartan sp = (Spartan) Utils.sortGetRandom(spartans);

        Viking vk = (Viking) Utils.sortGetRandom(vikings);

        Utils.Play(sp,vk);

    }
}
