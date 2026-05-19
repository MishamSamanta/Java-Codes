// FizzBuzz
// Print numbers 1 to 100. But for multiples of 3 print "Fizz", 
// for multiples of 5 print "Buzz", and for multiples of both 
// print "FizzBuzz".

public class FIZZBUZZ {
    public static void main(String[] args) {
        
        for(int i = 1; i <=100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
