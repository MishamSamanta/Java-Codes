import java.util.Scanner;

public class Email_slicer_substring {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            String email;
            String username;
            String domain;

            System.out.print("Enter your valid email id: ");

            email = scanner.nextLine();

            if (email.contains("@")) {
                username = email.substring(0, email.indexOf("@"));
                domain = email.substring(email.indexOf("@"));

                System.out.printf("\nThe username is: %s", username);
                System.out.printf("\nThe domain is: %s", domain);
            } else {
                System.out.println("The email is invalid");
                System.out.println("Please enter a valid email");
            }
        }
    }

}
