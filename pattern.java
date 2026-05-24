
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int t = scanner.nextInt();
        patterPrint(t);
    }

    static void patterPrint(int n){
        for (int i=1; i<= n; i++){
            for(int j=1; j<= i; j++){
                // System.out.print(i);
                if(i==1 || i==2){
                    System.out.print(i);
                }
                else if(i>2){
                    if(j==1 || j==i){
                        System.out.print(i);
                    }
                    else{
                        System.out.print("*");
                    }
                }
            } 
            System.out.println();
        }
    }
}
