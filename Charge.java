import java.util.Scanner;

public class Charge{
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("Please enter your batter percentage: ");
            int battery = scanner.nextInt();

            if(battery == 100){
                System.out.println("Fully Charged. Unplug to save energy.");
            }
            else if(battery >= 70 && battery <= 90){
                System.out.println("High Power Mode: All features enabled.");
            }
            else if(battery >= 20 && battery <= 69){
                System.out.println("Normal Mode: Standard performance.");
            }
            else if(battery >= 5 && battery <= 19){
                System.out.println("Low Power Mode: Dimming screen....");
            }
            else{
                System.out.println("Critical: Shutting down in 30 seconds.");
            }
        }
        
        
    }
    
}
