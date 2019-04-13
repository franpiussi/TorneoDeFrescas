package Interfaces;

import Interfaces.Urinate;

import java.util.Random;

public class UrinateSpartanImp implements Urinate {
    @Override
    public int urinate() {
        Random rand = new Random();
        return rand.nextInt(10-1+1)+1;
    }
}
