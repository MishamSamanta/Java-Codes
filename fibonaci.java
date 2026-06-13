import java.util.Scanner;

public class fibonaci{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the count: ");
        int count = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;

        for(int i = 1; i <= count; i++){
            System.out.print(n1 +" ");

            // Compute the next number
            int nextnumber = n1 + n2;
            n1 = n2;
            n2 = nextnumber;
        }
    }
}