import java.util.Scanner;

public class Unit_converter {
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            double weight;
            double newWeight;
            int choice;

            System.out.println("Weight convert: ");
            System.out.println("1: Convets lbs into kgs");
            System.out.println("2: Convert kgs into lbs");

            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter weight in lbs");
                weight = scanner.nextDouble();
                newWeight = weight * 0.4535;
                System.out.printf("The converted weight is %.2f", newWeight);
            }
            else if(choice == 2){
                System.out.print("Enter weight in kgs");
                weight = scanner.nextDouble();
                newWeight = weight * 2.2046;
                System.out.printf("The converted weight is %.2f", newWeight);
            }

            else{
                System.out.println("Invalid input....");
            }
        }
    }
}
