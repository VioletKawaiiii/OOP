public class App {
    
    public static void main(String[] args) throws Exception {
        solution1();
        System.out.println();
        solution2();
        System.out.println();
        solution3();
    }
    
    public static void solution1(){
       String input = "NUGRAHA";
       int length = input.length();
       for(int i = 0; i < length ; i++){
        for(int j = 0; j < length; j++){
            if(j >= length - i){
                System.out.print("* ");
            }else{
                System.out.print(input.charAt(j) + " ");
            }
        }

        System.out.println();
       }
    }

    public static void solution2(){
        String input = "NUGRAHA";
        int length = input.length();
        for(int i = 0; i < length ; i++){
         for(int j = 0; j < length; j++){
             if(j == i){
                 System.out.print(input.charAt(j) + " ");
             }else{
                 System.out.print("* ");
             }
         }
 
         System.out.println();
        }
     }

     public static void solution3(){
        String input = "NUGRAHA";
        int length = input.length();
        for(int i = 0; i < length ; i++){
         for(int j = 0; j < length; j++){
             
           System.out.print(input.charAt(i) + " ");
          
         }
 
         System.out.println();
        }
     }
}
