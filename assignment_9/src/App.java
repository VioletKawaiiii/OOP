public class App {
    
    public static void main(String[] args) throws Exception {
        String input = "NUGRAHA";

        solution1(input);
        System.out.println();
        solution2(input);
        System.out.println();
        solution3(input);
    }
    
    public static void solution1(String input){
       int length = input.length();
       for(int i = 0; i < length ; i++){
        for(int j = 0; j < length; j++){

            String output = (j >= length - i) ? "* " : input.charAt(j) + " "; 
            System.out.print(output);

        }

        System.out.println();
       }
    }

    public static void solution2(String input){
        int length = input.length();
        for(int i = 0; i < length ; i++){
         for(int j = 0; j < length; j++){

            String output = (j == i) ? input.charAt(j) + " ": "* ";
            System.out.print(output);
            
         }
 
         System.out.println();
        }
     }

     public static void solution3(String input){
        int length = input.length();
        int middle = length / 2;

        for(int i = 0; i < length ; i++){
         for(int j = 0; j < length; j++){
            
            String output;

            if (i == middle) {
                output = input.charAt(j) + "  ";
            } else if (j == middle) {
                output = input.charAt(i) + "  ";
            } else if (i == j && i == middle) {
                output = input + "  ";
            } else {
                output = "*  ";
            }

            System.out.print(output);
          
         }
 
         System.out.println();
        }
     }
}
