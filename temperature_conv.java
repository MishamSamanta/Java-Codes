import java.util.Scanner;

public class temperature_conv {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){

            double temp;
            double newTemp;
            String unit;

            System.out.print("Enter temperature you want to convert: ");
            temp = scanner.nextDouble();

            System.out.print("Enter in which you want to convert F or C: ");
            unit = scanner.nextLine().toUpperCase();

            // (condition) ? ture : false

            newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9/5) + 32 ;

            System.out.printf("%.1f%s", newTemp, unit);


    }


    }
    

}
