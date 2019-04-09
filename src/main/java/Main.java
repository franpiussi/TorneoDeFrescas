import java.util.*;

public class Main {

    public static void main(String[] args) {

        UrinateSpartanImp urinateSpartanImp = new UrinateSpartanImp() ;
        UrinateVikingImp urinateVikingImp = new UrinateVikingImp();
        DrinkSpartanImp drinkSpartanImp = new DrinkSpartanImp();
        DrinkVikingImp drinkVikingImp = new DrinkVikingImp();

        List<Spartan> Spartans = Arrays.asList(new Spartan("Franco",20,67,urinateSpartanImp,drinkSpartanImp,5),
                                                new Spartan("Ezequiel",25,80,urinateSpartanImp,drinkSpartanImp,4));
        List<Viking> Vikings= Arrays.asList(new Viking("Guido",22,64,urinateVikingImp,drinkVikingImp,7),
                                                    new Viking("Lucas",30,75,urinateVikingImp,drinkVikingImp,3));



    }
}
