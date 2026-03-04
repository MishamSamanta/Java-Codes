import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            char sign;
            double result = 0;
            Boolean validOperator = true;

            System.out.print("Welcom to CALCULATOR select ur desired sign: ");
            sign = scanner.next().charAt(0);

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            switch (sign) {
                case '+' -> result = a + b;
                case '-' -> result = a - b;
                case '*' -> result = a * b;
                case '/' -> {
                    if (b == 0){
                        System.out.println("Cannot divide by 0");
                        validOperator = false;
                    }
                    else{
                        result = a/b;
                    }
                }
                default -> {
                    System.out.println("Not valid input");
                    validOperator = false;
                }
            }

            if(validOperator){
                System.out.println("The desitrd reslut is : " + result);
            }

        }
    }

}