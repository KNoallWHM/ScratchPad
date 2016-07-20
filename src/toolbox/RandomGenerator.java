package toolbox;
import java.util.Random;
/**
 * Created by Superduo on 7/14/16.
 */
public class RandomGenerator {

    public static int randomInt(int min, int max) {

        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) +1) + min;
        //to call (random int) just call randomint

        return randomNumber;
    }
    public static void main(String[] args) {
        System.out.println(randomInt(5,12));
        randomInt(5,12);
    }

    public static int randomInt2(int min, int max) {
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) +1) + min;
        return randomNumber;

    }

}

