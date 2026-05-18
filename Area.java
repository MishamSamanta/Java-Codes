import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {

            double radius;
            double area;

            System.out.print("Enter the radius of the cirlce: ");
            radius = scanner.nextDouble();
            area = Math.PI*Math.pow(radius,2 );

            System.out.println("The area of the circle is: " + area + " cm^2");
            System.out.printf("The area of the circle is: %.1fcm^2 \n" , area);
        }
        
    }
}
