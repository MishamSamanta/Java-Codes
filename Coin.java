import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        
        Random random = new Random();

        boolean isHead;

        isHead = random.nextBoolean();

        if (isHead) {
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
