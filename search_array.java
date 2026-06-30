public class search_array {
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 6, 7, 9};
        int target = 3;
        boolean isFound = false;

        for(int i = 0; i<numbers.length; i++){
            if(target == numbers[i]){
                System.out.println("The element has been found " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("The element dosn't exist");
        }


    }
}
