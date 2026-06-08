import java.util.Scanner;

public class banking_prog{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] arg){
        
        

        double balance = 200.59;
        boolean isRunning = true;
        int choice;

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║      🏦 WELCOME TO JAVA BANK         ║");
        System.out.println("╚══════════════════════════════════════╝\n");

        while(isRunning){
            System.out.println("┌──────────────────────────────────────┐");
            System.out.println("│  1. Check Balance                    │");
            System.out.println("│  2. Deposit                          │");
            System.out.println("│  3. Withdraw                         │");
            System.out.println("│  4. Exit                             │");
            System.out.println("└──────────────────────────────────────┘");
            System.out.print("➤ Enter your choice (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> Show_balance(balance);
                case 2 -> balance += deposit_amt();
                case 3 -> balance -= withdraw_amt(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
                
      
            }   
        }
        
        System.out.println("Thank you have a nice day");
    } 

    static void Show_balance(double balance) {
        System.out.println("──────────────────────────────────────");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit_amt(){

        double amount;

        System.out.print("Enter your deposit:");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
    static double withdraw_amt(double balance){

        double amount;

        System.out.print("Enter the amount you want to withdraw");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Not enough balance");
            return 0;
        }
        else if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}