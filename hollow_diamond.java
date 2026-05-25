import java.util.Scanner;

public class hollow_diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd number: ");
        int inp = scanner.nextInt();

        if (inp % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            hollowdiamondPattern(inp);
        }
        
    }

    static void hollowdiamondPattern(int n){
        int middle = n / 2;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row <= middle) {
                    if (col == middle - row || col == middle + row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == row - middle || col == n - 1 - (row - middle)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
