import java.util.Scanner;

public class mad_lib{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {

            String adjective1;
            String noun1;
            String adjective2;
            String verb;
            String adjective3;

            System.out.print("Enter an adjective (place) :");
            adjective1 = scanner.nextLine();
            System.out.print("Enter an noun (perosn) :");
            noun1 = scanner.nextLine();
            System.out.print("Enter an adjective: ");
            adjective2 = scanner.nextLine();
            System.out.print("Enter an verb (in ing) :");
            verb = scanner.nextLine();
            System.out.print("Enter an adjective :");
            adjective3 = scanner.nextLine();

            System.out.print("\nToday I went to " + adjective1 + " zoo");
            System.out.print("\nTheir I saw " + noun1 + " with " + adjective2);
            System.out.print("\nHe was " + verb + " his ass");
            System.out.print("\nI would never " + adjective3 + " again");
        }
    }


}