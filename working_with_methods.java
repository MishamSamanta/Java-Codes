
import java.util.Scanner;

public class working_with_methods {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    //for double
        // System.out.print("Enter a number: ");
        // int n = scanner.nextInt();
        // double result = square(n);
        // System.out.printf("The square is %f\n", result);

    //for boolean
        // System.out.println("Enter your age: ");

        // int age = scanner.nextInt();
        // boolean check = ageCheck(age);
        // if(check == true){
        //     System.out.println("Your are eligible to vote");
        // }
        // else{
        //     System.out.println("You need to be 18+ sorry");
        // }

    //for string
        // System.out.println("Enter your name: ");
        // String you = scanner.nextLine();
        // String result = intro(you);
        // System.out.println(result);

    //for void
        System.out.println("Enter the job you wanna do: ");
        String p = scanner.nextLine();
        showJob(p);
    
    }

    static double square(double number){
        return number * number;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }

        // return age>=18; thsi will also work and it is shrotcut 
    }
    static String intro(String name){
        return "Hello "+ name;

    }
    static void showJob(String work){
        System.out.println("Your job is to do "+ work);
    }
}
