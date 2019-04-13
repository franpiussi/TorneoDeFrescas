package interfaces;

import java.util.Random;

public class DrinkVikingImp implements Drink {

    @Override
    public int drink() {
        Random rand = new Random();
        return rand.nextInt(10-1+1)+1;
    }
}
