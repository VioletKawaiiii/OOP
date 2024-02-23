package assignment_1;

// Muhammad Fikry Haikal
// 20220040180
// OOP - Assignment 1


// 0 2 4 6 8
// 1 3 5 7 9
// 1 2 4 7 11 16 22
// -3 -1 2 6 11 17 24
// 1 1 2 3 5 8 13 21
// 0 1 2 3 6 11 20 37



public class NumberSequence{
    public static void main(String[] args) throws Exception {
       sequenceA();
       sequenceB();
       sequenceC();
       sequenceD();
       sequenceE();
       sequenceF();
       
    }

    private static void sequenceA() {
        int n = 8;

        for(int i = 0; i <= n; i += 2){
            int result = i;
            System.out.print(result + " ");
        }

        System.out.println();
    }

    private static void sequenceB() {
        int n = 9;

        for(int i = 1; i <= n; i += 2){
            int result = i;
            System.out.print(result + " ");
        }

        System.out.println();
    }

    private static void sequenceC(){
        int a = 1;
        int n = 7;

        System.out.print(a + " ");

        for(int i = 1; i < n; i++){
            a += i;
            System.out.print(a + " ");
        }

        System.out.println();
    }

    private static void sequenceD(){
        int a = -3;
        int n = 6;

        System.out.print(a + " ");

        for(int i = 0; i < n ; i++) {
            a += i + 2;
            System.out.print(a + " ");
        }

        System.out.println();
    }

    private static void sequenceE(){
        int a = 1;
        int b = 1; 
        int n = 7;

        System.out.print(a + " " + b + " ");
        for(int i = 2; i <= n; i++){
            int nextNumber = a + b;

            System.out.print(nextNumber + " ");

            a = b;
            b = nextNumber ;
        }

        System.out.println();
    }

    // 0 1 2 3 6 11 20 37

    public static void sequenceF(){
        int a = 0;
        int b = 1;
        int c = 2;
        int n = 7;

        System.out.print(a + " " + b + " " + c + " ");
    
        for(int i = 2; i < n; i++){
            int nextNumber = a + b + c;

            System.out.print(nextNumber + " ");
            
            a = b;
            b = c;
            c = nextNumber;
        }


    }

   
}