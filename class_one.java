import java.util.Scanner;


public class class_one {
    public static void main(String[] args) {
        
        // String[] fruits = {"apple", "Bananna", "Mango", "Grape"};

        // System.out.println(fruits[0]);

        // enhanced for loop


        // we have to set the lenght of array to print the or take the number of elemtns

        Scanner scanner = new Scanner(System.in);

        // String[] fruits = new String[5]; making this user deterined

        String[] fruits;
        int size;

        System.out.print("Enter a number: ");
        
        size = scanner.nextInt(); // since we are accepting a string then interger their is an input buffer 
        // this is specilaly occurs in case of scanner so here we have to do this 
        // that's why it was not taking the first input 
        scanner.nextLine(); // this will clear the input buffer
        

        fruits = new String[size];

        for (int i = 0; i < fruits.length; i++){

            System.out.print("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        for (String fruit : fruits){
            
            System.out.println(fruit);
        }
    }
}
