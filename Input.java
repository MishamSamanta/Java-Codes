import java.util.Scanner;

// public class Input {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine();

//         System.out.println("Hello " + name);


//         scanner.close();
//     }
// }

public static void main(String[] args) {
    // This is "Try-with-resources"
    try (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Enter your name: ");
        String name = scanner.next();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("What is your CGPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you Gay: True/False: ");
        boolean isGay = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("The age of the student is " + age);
        System.out.println("Your CGPA is " + gpa);

        if(isGay){
            System.out.println("You are a Gay darling");
        }
        else{
            System.out.println("You are straight");
        }


    } 
    // No scanner.close() needed here; it happens automatically!
}


// import java.util.Scanner;

// public class Input {
//     public static void main(String[] args) {
        
//         // This line tells the IDE to ignore the "resource" warning
//         @SuppressWarnings("resource")
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine(); 

//         System.out.println("Hello " + name);

//         // Even with this, the IDE sometimes complains because it's System.in
//         scanner.close();
//     }
// }