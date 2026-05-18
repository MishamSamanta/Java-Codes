import java.util.Random;

public class Nested {
    public static void main(String[] args){

        Random random = new Random();

        // boolean isStudent = true;
        // boolean isSenior = false;

        boolean isStudent = random.nextBoolean();
        boolean isSenior = random.nextBoolean();
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
            }
            else{
                System.out.println("You do not get any discounts");
            }
        }

        System.out.printf("Your final price is $%.2f", price);
    }
    
}
