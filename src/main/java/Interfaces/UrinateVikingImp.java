package Interfaces;

import Interfaces.Urinate;

import java.util.Random;

public class UrinateVikingImp implements Urinate {
    @Override
    public int urinate() {
        Random rand = new Random();
        return rand.nextInt(8-1+1)+1;
    }
}
