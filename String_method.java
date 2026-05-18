public class String_method{
        public static void main(String[] args) {
            
            String name = "Misham Samanta";

            int length = name.length();
            char place = name.charAt(4);
            int index = name.indexOf("m");
            int last_in = name.lastIndexOf("m");

            // name = name.toUpperCase();
            // name = name.toLowerCase();
            // name = name.trim();
            // name = name.replace("a", "o");


            System.out.println(length);
            System.out.println(place);
            System.out.println(index);
            System.out.println(last_in);

            /* 
            if(name.isEmpty()){
                System.out.println("Your names is empty");
            }
            else{
                System.out.println("Hello " + name);
            }
            */

            /* 
            if(name.contains(" ")){
                System.out.println("Your names is empty");
            }
            else{
                System.out.println("Hello " + name);
            }
            */

            /* 
            if(name.equals("password")){
                System.out.println("Your names is empty");
            }
            else{
                System.out.println("Hello " + name);
            }
            */
        }
}