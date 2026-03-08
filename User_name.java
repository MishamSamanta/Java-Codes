import java.util.Scanner;

public class User_name {
    public static void main(String[] args) {
        
        //user name must be between 4-12 character
        //username must not contain spaces or underscore 

        try(Scanner scanner = new Scanner(System.in)){
            
            String user;
            int length;

            System.out.print("Enter your username: ");
            user = scanner.nextLine();
            length = user.length();

            if (length <= 4 || length >= 12){
                System.out.println("Sorry the user name is out of its length");
            }
            else if (user.contains(" ") || user.contains("_")){
                System.out.println("Your user name must not contain spaces and undersore");
            }
            else {
                System.out.print("Your user name is " + user);
            }


        }
    }
}
