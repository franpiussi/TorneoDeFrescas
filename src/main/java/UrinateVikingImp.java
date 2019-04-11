import java.util.Random;

public class UrinateVikingImp implements Urinate{
    @Override
    public int urinate() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
