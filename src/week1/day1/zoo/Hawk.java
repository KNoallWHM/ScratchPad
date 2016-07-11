package week1.day1.zoo;

/**
 * Created by katiebunnell on 7/11/16.
 */
public class Hawk extends Bird {
    public Hawk() {
        this.name = "Hawk";
    }
    @Override
    public void makeSound() {
        System.out.println("Cawww!");
    }
}
